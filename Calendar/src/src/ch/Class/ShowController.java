package src.ch.Class;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;

public class ShowController implements Initializable {

	@FXML protected TextField tfj;
	@FXML protected ImageView image1;
	@FXML protected ImageView image2;
	@FXML protected TabPane tp;
	@FXML protected AnchorPane january;

	@FXML
	public void template1(ActionEvent event) {
/*		tp.getSelectionModel().selectedItemProperty().addListener((obs,ov,nv)->{
			String test;
			test = nv.getText();
			System.out.println(test);
		});*/
		image1.setX(0);
		image1.setY(0);
		image1.setFitHeight(207);
		image1.setFitWidth(570);
		image2.setVisible(false);
	}

	@FXML
	public void template2(ActionEvent event) {
		image1.setX(0);
		image1.setY(0);
		image1.setFitHeight(207);
		image1.setFitWidth(276);
		image2.setVisible(true);
		image2.setX(0);
		image2.setY(0);
		image2.setFitHeight(207);
		image2.setFitWidth(276);
	}

	@FXML
	public void upload(ActionEvent event) {
		
	}

	@FXML
	public void imagek1(MouseEvent event) {
		ImageView ima = (ImageView) event.getSource();
		FileChooser fileChooser = new FileChooser();

		// Set extension filter
		FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
		FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
		fileChooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);

		// Show open file dialog
		File file = fileChooser.showOpenDialog(null);

		try {
			BufferedImage bufferedImage = ImageIO.read(file);
			Image image = SwingFXUtils.toFXImage(bufferedImage, null);
			ima.setImage(image);
		} catch (IOException ex) {
			Logger.getLogger(ShowController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public void imagek2(MouseEvent event) {
		ImageView ima = (ImageView) event.getSource();
		FileChooser fileChooser = new FileChooser();
		
		// Set extension filter
		FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
		FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
		fileChooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);
		
		// Show open file dialog
		File file = fileChooser.showOpenDialog(null);
		
		try {
			BufferedImage bufferedImage = ImageIO.read(file);
			Image image = SwingFXUtils.toFXImage(bufferedImage, null);
			ima.setImage(image);
		} catch (IOException ex) {
			Logger.getLogger(ShowController.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
}
