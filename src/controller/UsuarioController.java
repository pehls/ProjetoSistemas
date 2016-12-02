package controller;

import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Notification;
import model.TelaUsuario;

public class UsuarioController {
	
	@FXML
	TableView<TelaUsuario> listaTbView;
	
	@FXML
	TableColumn<TelaUsuario, String> pedidoTbCol;
	
	@FXML
	TableColumn<TelaUsuario, String> statusTbCol;
	
	@FXML
	TableColumn<TelaUsuario, String> fornecedorTbCol;
	
	@FXML
	TableColumn<TelaUsuario, Button> botaoTbCol;
	
	@FXML
	Button historicoBtn;
	
	@FXML
	Button verNotificacoesBtn;
	
	@FXML
	Button gerarNovoPedidoBtn;
	
	@FXML
	Button atualizarBtn;
	
	@FXML
	Label usuarioLbl;
	
	@FXML
	TextField buscarTxtField;
	
	@FXML
	Button buscarBtn;
	
	@FXML
	TableView<Notification> notificacoesTbV;
	
	@FXML
	TableColumn<Notification, String> notificacoesTbColumn;
	
	@FXML
	ComboBox<String> tipoPesquisaCbB;
	
	private List<TelaUsuario> itens = Arrays.asList(
			new TelaUsuario(null,null,null),
			new TelaUsuario("1234", "Em deslocamento", "Loja do Zé"),
			new TelaUsuario("1235", "Em deslocamento", "Nacional")
			);
	public void Atualizar() {
		//this.usuarioLbl.setText(ItensEstaticos.getLogin().getLGN_USERNAME());
		this.usuarioLbl.setText("joao");
		/*
		 * 	 String pedido, status, fornecedor;
		 *	 Button btn;
		 * 
		 */
		
		pedidoTbCol.setCellValueFactory(new PropertyValueFactory<TelaUsuario, String>("pedido"));
		
		statusTbCol.setCellValueFactory(new PropertyValueFactory<TelaUsuario, String>("status"));
		
		fornecedorTbCol.setCellValueFactory(new PropertyValueFactory<TelaUsuario, String>("fornecedor"));
		
		botaoTbCol.setCellValueFactory(new PropertyValueFactory<TelaUsuario, Button>("btn"));
		
		this.listaTbView.autosize();
		
		this.listaTbView.setItems(FXCollections.observableArrayList(itens));
		//this.listaTbView.getColumns().addAll(pedidoTbCol, statusTbCol, fornecedorTbCol, botaoTbCol);
		
	}
}
