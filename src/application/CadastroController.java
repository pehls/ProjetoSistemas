package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import managedbean.LoginMB;
import model.Login;
import model.LoginType;

public class CadastroController {
	@FXML
	TextField txUser;
	
	@FXML
	TextField txPass;

	@FXML
	TextField txTipe;
	
	@FXML
	Button cadastroBtn;
	
	private LoginMB lgMB = new LoginMB();
	public void Cadastrar () {
		System.out.println(txUser.getText() + " - "+ txPass.getText());
		Login lg = new Login(txUser.getText(), txPass.getText());
		
		LoginType lgnTp = new LoginType(txTipe.getText());
		lg.setLoginType(lgnTp);
		
		LoginMB lgMB = new LoginMB();
		lgMB.setLogin(lg);
		lgMB.adicionarLogins();
		
		
	}

}
