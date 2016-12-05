package com.notify.it.model;

import com.notify.it.application.AcompanhamentoView;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaUsuario {
	private String pedido, status, fornecedor;
	private Button btn;
	public TelaUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TelaUsuario(String pedido, String status, String fornecedor) {
		super();
		this.pedido = pedido;
		this.status = status;
		this.fornecedor = fornecedor;
		btn = new Button("Acompanhar");
        btn.setOnAction((a) ->{
        	AcompanhamentoView acompanhamento = new AcompanhamentoView();
    		try {
				acompanhamento.start(new Stage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    });
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Button getBtn() {
		return btn;
	}
	
}
