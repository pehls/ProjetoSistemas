package com.notify.it.controller;

import com.notify.it.model.Login;
import com.notify.it.model.LoginType;
import com.notify.it.util.ItensEstaticos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CadastroController {

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
		
		if (ItensEstaticos.getLoginBO().setLogin(lg))
				ItensEstaticos.getStageCadastro().close();
	}


}
