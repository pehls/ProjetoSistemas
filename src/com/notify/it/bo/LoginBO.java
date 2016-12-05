package com.notify.it.bo;

import java.util.List;

import com.notify.it.exceptions.ValidacaoLoginException;
import com.notify.it.managedbean.LoginMB;
import com.notify.it.model.Login;
import com.notify.it.util.ItensEstaticos;

public class LoginBO {
		LoginMB loginMB = ItensEstaticos.getLgMB();

		public LoginBO() {
			
		}
		
		public Login getLogin (String user, String password) throws ValidacaoLoginException {
			List<Login> logins = loginMB.getLogin(user, password);
			for (Login login : logins) {
				System.out.println(login.toString());
				if (login.getLGN_USERNAME().compareToIgnoreCase(user)==0)
					if(login.getLGN_PASSWORD().compareToIgnoreCase(password)==0)
						return login;
					else
						throw new ValidacaoLoginException();
			}
			return null;
		}
		public boolean setLogin (Login login) {
			this.loginMB.setLogin(login);
			return this.loginMB.adicionarLogins();
		}
		public List<Login> getLogins() {
			return loginMB.getLogins();
		}

		public void setLoginMB(LoginMB loginMB) {
			this.loginMB = loginMB;
		}

}
