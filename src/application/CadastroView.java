package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CadastroView extends Application{

	public static Stage thisStage;
	@Override
	public void start(Stage primaryStage) throws Exception {
		thisStage = primaryStage;
		primaryStage.setTitle("Cadastro");
        Pane myPane = (Pane)FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	

}
