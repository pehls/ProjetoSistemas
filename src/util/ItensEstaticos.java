package util;

import bo.LoginBO;
import javafx.stage.Stage;
import managedbean.LoginMB;
import model.Login;

public class ItensEstaticos {
	private static final LoginMB lgMB = new LoginMB();
	private static final LoginBO loginBO = new LoginBO();
	private static final JpaUtil jpaUtil = new JpaUtil();
	private static Stage stageCadastro, stageLogin, stageUsuario, stageAcompanhamento;
	private static Login login;
	public static Stage getStageLogin() {
		return stageLogin;
	}
	public static void setStageLogin(Stage stageLogin) {
		ItensEstaticos.stageLogin = stageLogin;
	}
	public static LoginMB getLgMB() {
		return lgMB;
	}
	
	public static Stage getStageCadastro() {
		return stageCadastro;
	}
	public static void setStageCadastro(Stage stageCadastro) {
		ItensEstaticos.stageCadastro = stageCadastro;
	}
	public static Stage getStageUsuario() {
		return stageUsuario;
	}
	public static void setStageUsuario(Stage stageUsuario) {
		ItensEstaticos.stageUsuario = stageUsuario;
	}
	public static Login getLogin() {
		return login;
	}
	public static void setLogin(Login login) {
		ItensEstaticos.login = login;
	}
	public static Stage getStageAcompanhamento() {
		return stageAcompanhamento;
	}
	public static void setStageAcompanhamento(Stage stageAcompanhamento) {
		ItensEstaticos.stageAcompanhamento = stageAcompanhamento;
	}
	public static LoginBO getLoginBO() {
		return loginBO;
	}
	public static JpaUtil getJpautil() {
		return jpaUtil;
	}


}
