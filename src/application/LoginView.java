package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginView extends Application {
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("Login");
        Pane myPane = (Pane)FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
