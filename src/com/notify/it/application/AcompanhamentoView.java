package com.notify.it.application;

import com.notify.it.util.ItensEstaticos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AcompanhamentoView extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Acompanhamento");
        Pane myPane = (Pane)FXMLLoader.load(getClass().getResource("/com/notify/it/views/Acompanhamento.fxml"));
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        ItensEstaticos.setStageAcompanhamento(primaryStage);
        primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}	

}
