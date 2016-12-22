package src.ch.Class;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application{
	
	public static Stage mainStage;
	
	public static void main(String... args) {
		launch(args);
	}
	/**
	 * change the scene to main.fxml and set the title to Calendar
	 * and set the window in the center of the screen
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(root);

		primaryStage.setTitle("Calendar");
		primaryStage.centerOnScreen();
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		primaryStage.setX(d.width/2-(primaryStage.getWidth()));
		primaryStage.setY(d.width/2-(primaryStage.getWidth()));
		
		mainStage = primaryStage;
	}
	/**
	 * change the scenes in the Progamms.
	 */
	public static void loadScene(String name) {
		Parent parentToLoad = null;
		try {
			URL resourcePath = ViewController.class.getResource(name + ".fxml");
			parentToLoad = FXMLLoader.load(resourcePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene sceneToLoad = new Scene(parentToLoad);
		mainStage.setScene(sceneToLoad);
	}
	public interface ViewController {
		void init(Stage stage);
	}
}
