package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import util.ItensEstaticos;

public class CadastroView extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Cadastro");
        Pane myPane = (Pane)FXMLLoader.load(getClass().getResource("/application/Cadastro.fxml"));
        Scene myScene = new Scene(myPane);
        primaryStage.setScene(myScene);
        ItensEstaticos.setStageCadastro(primaryStage);
        primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}	

}
