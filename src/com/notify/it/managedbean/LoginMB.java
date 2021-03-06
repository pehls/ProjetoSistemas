package com.notify.it.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.notify.it.model.Login;
import com.notify.it.util.ItensEstaticos;
import com.notify.it.util.JpaUtil;

@ManagedBean
public class LoginMB {

	private Login login;
	private ArrayList<Login> logins;

	// private FullDAO loginDao;
	public LoginMB() {
		login = new Login();
		logins = new ArrayList<Login>();
		// loginDao = new FullDAO();
	}

	public Login getLogin() {
		return login;
	}
	
	public List<Login> getLogin (String username, String password) {
		ItensEstaticos.getJpautil();
		@SuppressWarnings("unchecked")
		List<Login> results = (List<Login>) JpaUtil.buscarQuery("login.byUser", username);
		return results;
	}

	public void setLogin(Login login) {
		this.logins.add(login);
	}

	public boolean adicionarLogins() {
		try {
			for (Login login : logins) {
				ItensEstaticos.getJpautil();
				JpaUtil.salvar(login);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public List<Login> getLogins() {
		ItensEstaticos.getJpautil();
		@SuppressWarnings("unchecked")
		List<Login> results = (List<Login>) JpaUtil.buscarQuery("login.list");
		return results;
	}

}
