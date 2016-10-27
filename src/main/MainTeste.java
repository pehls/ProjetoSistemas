package main;

import managedbean.LoginMB;
import model.Login;
import model.LoginType;

public class MainTeste {
/*
 * https://github.com/pehls/Cursos-Target/blob/master/ExercicioHandsOn09/
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login lg = new Login("joao", "123");
		LoginType lgnTp = new LoginType("customer");
		lg.setLoginType(lgnTp);
		LoginMB lgMB = new LoginMB();
		lgMB.setLogin(lg);
		
		System.out.println(lgMB.adicionarLogins());
	}

}
