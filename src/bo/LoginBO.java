package bo;

import java.util.List;

import exceptions.ValidacaoLoginException;
import managedbean.LoginMB;
import model.Login;

public class LoginBO {
		LoginMB loginMB;

		public LoginBO(LoginMB lgMB) {
			this.loginMB = lgMB;
		}

		public void setLoginMB(LoginMB loginMB) {
			this.loginMB = loginMB;
		}
		
		public Login getLogin (String user, String password) throws ValidacaoLoginException {
			List<Login> logins = loginMB.getLogin(user, password);
			for (Login login : logins) {
				System.out.println(login.toString());
				if (login.getLGN_USERNAME().compareTo(user)==0)
					if(login.getLGN_PASSWORD().compareTo(password)==0)
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

}
