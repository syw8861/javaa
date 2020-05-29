package panes.vbox_hbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("Root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("VBox HBox");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
