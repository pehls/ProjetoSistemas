package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import util.ItensEstaticos;

public class UsuarioView extends Application {
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("Usuario");
        Pane myPane = (Pane)FXMLLoader.load(getClass().getResource("Usuario.fxml"));
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        ItensEstaticos.setStageUsuario(primaryStage);
        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
