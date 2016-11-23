package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import managedbean.LoginMB;
import model.Login;
import model.LoginType;
import util.ItensEstaticos;

public class CadastroController {
	private static final LoginMB LG_MB = ItensEstaticos.getLgMB();

	@FXML
	TextField txUser;
	
	@FXML
	TextField txPass;

	@FXML
	TextField txTipe;
	
	@FXML
	Button cadastroBtn;
	
	public Button getCadastroBtn() {
		return cadastroBtn;
	}
	
	public void Cadastrar () {
		System.out.println(txUser.getText() + " - "+ txPass.getText());
		Login lg = new Login(txUser.getText(), txPass.getText());
		
		LoginType lgnTp = new LoginType(txTipe.getText());
		lg.setLoginType(lgnTp);
		
		LG_MB.setLogin(lg);
		if (LG_MB.adicionarLogins())
				ItensEstaticos.getStageCadastro().close();
	}


}
