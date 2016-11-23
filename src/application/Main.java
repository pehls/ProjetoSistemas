package application;
	
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import managedbean.LoginMB;
import model.Login;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;



public class Main extends Application {
	
	@FXML
	TextField txUser;
	
	@FXML
	TextField txPass;
	
	public static void main(String[] args) {
		launch(args);
	}	
	
	@Override
	public void start(Stage primaryStage) {
		
		
		
		try {
			/* BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show(); */
			
			// Parent page = FXMLLoader.<Parent>load(MainWindowController.class.getResource("Main.fxml").toExternalForm());			
			
			// Parent page = FXMLLoader.load("./Main.fxml");
			
			/*URL arquivoFXML = getClass().getResource(
					"./Main.fxml");
					Parent fxmlParent = (Parent) FXMLLoader.load( getClass().getResource(
							"Z:/git/ProjetoSistemas/src/principal/Main.fxml"));
					primaryStage.setScene(new Scene(fxmlParent, 300, 100));
					// primaryStage.setTitle("Olá mundo com FXML");
					primaryStage.show(); */			
			
			
			   Parent root = FXMLLoader.load(getClass().getResource("./principal/Main.fxml"));
			    Scene scene = new Scene(root, 200, 200);
			    // stage.setTitle("FXML Welcome");
			    primaryStage.setScene(scene);
			    primaryStage.show();			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public void Click() {
		String usuario = txUser.getText();
		String senha = txPass.getText();
		LoginMB cLoginMB = new LoginMB();
		Login lgn = cLoginMB.getLogin(usuario, senha);
		System.out.println(lgn.toString());
		
	}
	
}
