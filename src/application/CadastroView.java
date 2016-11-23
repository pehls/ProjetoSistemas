package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import managedbean.LoginMB;
import model.Login;
import model.LoginType;

public class CadastroView extends Application{

	private static  Stage stageCadastro;
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Cadastro");
        Pane myPane = (Pane)FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        stageCadastro = primaryStage;
        primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	public Stage getStageCadastro() {
		return stageCadastro;
	}
	@FXML
	TextField txUser;
	
	@FXML
	TextField txPass;

	@FXML
	TextField txTipe;
	
	@FXML
	Button cadastroBtn;
	
	private LoginMB lgMB = new LoginMB();
	
	public Button getCadastroBtn() {
		return cadastroBtn;
	}
	
	public void Cadastrar () {
		System.out.println(txUser.getText() + " - "+ txPass.getText());
		Login lg = new Login(txUser.getText(), txPass.getText());
		
		LoginType lgnTp = new LoginType(txTipe.getText());
		lg.setLoginType(lgnTp);
		
		LoginMB lgMB = new LoginMB();
		lgMB.setLogin(lg);
		if (lgMB.adicionarLogins())
				stageCadastro.close();
	}

	

}
