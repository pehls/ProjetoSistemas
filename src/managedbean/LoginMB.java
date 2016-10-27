package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import controller.FullDAO;
import model.Login;

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

	public void setLogin(Login login) {
		this.logins.add(login);
	}

	public boolean adicionarLogins() {
		try {
			for (Login login : logins) {
				FullDAO.salvar(login);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
