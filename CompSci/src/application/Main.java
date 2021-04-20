package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	Stage window;
	Button Startbutt;
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window = primaryStage;
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@FXML
	private void Startbutt(ActionEvent event) {
		int count=0;
		count++;
		System.out.println("aah "+count);
		}

	public static void main(String[] args) {
		launch(args);
	}
}
