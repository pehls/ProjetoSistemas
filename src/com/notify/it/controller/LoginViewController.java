/*
 * Copyright (c) 2012, 2014 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.notify.it.controller;

import java.io.IOException;

import com.notify.it.application.CadastroView;
import com.notify.it.application.UsuarioView;
import com.notify.it.exceptions.ValidacaoLoginException;
import com.notify.it.util.ItensEstaticos;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginViewController {
	@FXML
	TextField txUser;

	@FXML
	TextField txPass;

	@FXML
	Button loginBtn;
	
	
	
	@FXML
	public void Login() throws ValidacaoLoginException, IOException {
		String login = txUser.getText();
		String senha = txPass.getText();
		System.out.println(login + " - " + senha);
		ItensEstaticos.setLogin(ItensEstaticos.getLoginBO().getLogin(login, senha));
		// Login lg = new Login(login, senha);
		//
		// LoginType lgnTp = new LoginType("customer");
		// lg.setLoginType(lgnTp);
		//
		// LoginMB lgMB = new LoginMB();
		// lgMB.setLogin(lg);
		// lgMB.adicionarLogins();
		if (ItensEstaticos.getLogin() != null){
			System.out.println(ItensEstaticos.getLogin().toString());
			UsuarioView usuario = new UsuarioView();
			usuario.start(new Stage());
		}else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Cadastre-se!");
			alert.setHeaderText("Ops, você não se cadastrou!");
			alert.setContentText("Por favor, aperte em cadastrar e cadastre-se!");

			alert.showAndWait();
		}
	}

	@FXML
	public void Cadastrar() throws Exception {

		// Stage primaryStage = new Stage();
		// primaryStage.setTitle("Cadastro");
		// Pane myPane =
		// (Pane)FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
		// Scene myScene = new Scene(myPane);
		// primaryStage.setScene(myScene);
		// primaryStage.show();
		CadastroView cadastro = new CadastroView();
		cadastro.start(new Stage());
	}

}