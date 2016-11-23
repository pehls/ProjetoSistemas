package util;

import javafx.stage.Stage;
import managedbean.LoginMB;

public class ItensEstaticos {
	private static LoginMB lgMB = new LoginMB();
	private static  Stage stageCadastro, stageLogin;
	public static Stage getStageLogin() {
		return stageLogin;
	}
	public static void setStageLogin(Stage stageLogin) {
		ItensEstaticos.stageLogin = stageLogin;
	}
	public static LoginMB getLgMB() {
		return lgMB;
	}
	public static void setLgMB(LoginMB lgMB) {
		ItensEstaticos.lgMB = lgMB;
	}
	public static Stage getStageCadastro() {
		return stageCadastro;
	}
	public static void setStageCadastro(Stage stageCadastro) {
		ItensEstaticos.stageCadastro = stageCadastro;
	}

}
