package panes.borderpanes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BorderMain extends Application
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
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("BorderPane");
		primaryStage.show();
	}

}
