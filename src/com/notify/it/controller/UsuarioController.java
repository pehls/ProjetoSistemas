package com.notify.it.controller;

import java.util.Arrays;
import java.util.List;

import com.notify.it.model.Notification;
import com.notify.it.model.TelaUsuario;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

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
			new TelaUsuario("1234", "Em deslocamento", "Loja do Z�"),
			new TelaUsuario("1235", "Em deslocamento", "Nacional")
			);
	private List <Notification> itensNotification = Arrays.asList (
			new Notification("O Motoboy informou atraso de 5 minutos", 1),
			new Notification("Seu medicamento est� em espera na Farm�cia Panvel", 2)
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
		
		notificacoesTbV.setEditable(true);
		notificacoesTbV.getSelectionModel().setCellSelectionEnabled(true);  // selects cell only, not the whole row
		notificacoesTbV.setOnMouseClicked(new EventHandler<MouseEvent>() {
		 @Override
		 public void handle(MouseEvent click) {
		  if (click.getClickCount() == 2) {
		   @SuppressWarnings("rawtypes")
		   TableView tv = (TableView) click.getSource();
		   TablePosition tb = tv.getEditingCell();
		   tb.getRow();
		   TableColumn column = tb.getTableColumn();
		   OpenAlert(column.getCellData(tb.getRow()).toString());
		  }
		 }
		});
		     notificacoesTbColumn.setCellValueFactory(new PropertyValueFactory<Notification, String>("NTC_INFO"));

		this.notificacoesTbV.autosize();
		
		this.notificacoesTbV.setItems(FXCollections.observableArrayList(itensNotification));
	}
	
	public void OpenAlert (String text) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Notifica��o");
		alert.setHeaderText(text);

		alert.showAndWait();
		
	}
}
