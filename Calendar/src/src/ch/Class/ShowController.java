package src.ch.Class;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class ShowController {

	@FXML
	protected TextField textjear;
	@FXML
	protected ImageView image1;
	@FXML
	protected ImageView image2;

	@FXML
	protected ImageView JanuaryP1;
	@FXML
	protected ImageView JanuaryP2;
	@FXML
	protected ImageView FeburaryP1;
	@FXML
	protected ImageView FeburaryP2;
	@FXML
	protected ImageView MarchP1;
	@FXML
	protected ImageView MarchP2;
	@FXML
	protected ImageView AprilP1;
	@FXML
	protected ImageView AprilP2;
	@FXML
	protected ImageView MayP1;
	@FXML
	protected ImageView MayP2;
	@FXML
	protected ImageView JuneP1;
	@FXML
	protected ImageView JuneP2;
	@FXML
	protected ImageView JulyP1;
	@FXML
	protected ImageView JulyP2;
	@FXML
	protected ImageView AugustP1;
	@FXML
	protected ImageView AugustP2;
	@FXML
	protected ImageView SeptemberP1;
	@FXML
	protected ImageView SeptemberP2;
	@FXML
	protected ImageView OctoberP1;
	@FXML
	protected ImageView OctoberP2;
	@FXML
	protected ImageView NovemberP1;
	@FXML
	protected ImageView NovemberP2;
	@FXML
	protected ImageView DecemberP1;
	@FXML
	protected ImageView DecemberP2;
	@FXML
	protected TabPane tp;
	@FXML
	protected Label labelYear;

	String month;
	String date;
	String test = "January";

	/**
	 * @param event
	 * 
	 *            sets the imageView 1 to the size 207 and 570 and disable the
	 *            imageView 2
	 */
	@FXML
	public void template1(ActionEvent event) {
		tp.getSelectionModel().selectedItemProperty().addListener((obs, ov, nv) -> {
			test = nv.getText();
		});
		switch (test) {
		case "January":
			JanuaryP1.setFitHeight(207);
			JanuaryP1.setFitWidth(570);
			JanuaryP2.setVisible(false);
			break;
		case "Feburary":
			FeburaryP1.setFitHeight(207);
			FeburaryP1.setFitWidth(570);
			FeburaryP2.setVisible(false);
			break;
		case "March":
			MarchP1.setFitHeight(207);
			MarchP1.setFitWidth(570);
			MarchP2.setVisible(false);
			break;
		case "April":
			AprilP1.setFitHeight(207);
			AprilP1.setFitWidth(570);
			AprilP2.setVisible(false);
			break;
		case "May":
			MayP1.setFitHeight(207);
			MayP1.setFitWidth(570);
			MayP2.setVisible(false);
			break;
		case "June":
			JuneP1.setFitHeight(207);
			JuneP1.setFitWidth(570);
			JuneP2.setVisible(false);
			break;
		case "July":
			JulyP1.setFitHeight(207);
			JulyP1.setFitWidth(570);
			JulyP2.setVisible(false);
			break;
		case "August":
			AugustP1.setFitHeight(207);
			AugustP1.setFitWidth(570);
			AugustP2.setVisible(false);
			break;
		case "September":
			SeptemberP1.setFitHeight(207);
			SeptemberP1.setFitWidth(570);
			SeptemberP2.setVisible(false);
			break;
		case "October":
			OctoberP1.setFitHeight(207);
			OctoberP1.setFitWidth(570);
			OctoberP2.setVisible(false);
			break;
		case "November":
			NovemberP1.setFitHeight(207);
			NovemberP1.setFitWidth(570);
			NovemberP2.setVisible(false);
			break;
		case "December":
			DecemberP1.setFitHeight(207);
			DecemberP1.setFitWidth(570);
			DecemberP2.setVisible(false);
			break;
		}
	}

	/**
	 * @param event
	 * 
	 *            sets the imageView 1 to the size 207 and 276 and the imageView
	 *            2 to the same size
	 */
	@FXML
	public void template2(ActionEvent event) {
		tp.getSelectionModel().selectedItemProperty().addListener((obs, ov, nv) -> {
			test = nv.getText();
		});
		switch (test) {
		case "January":
			JanuaryP1.setFitHeight(207);
			JanuaryP1.setFitWidth(276);
			JanuaryP2.setVisible(true);
			JanuaryP2.setFitHeight(207);
			JanuaryP2.setFitWidth(276);
			break;
		case "Feburary":
			FeburaryP1.setFitHeight(207);
			FeburaryP1.setFitWidth(276);
			FeburaryP2.setVisible(true);
			FeburaryP2.setFitHeight(207);
			FeburaryP2.setFitWidth(276);
			break;
		case "March":
			MarchP1.setFitHeight(207);
			MarchP1.setFitWidth(276);
			MarchP2.setVisible(true);
			MarchP2.setFitHeight(207);
			MarchP2.setFitWidth(276);
			break;
		case "April":
			AprilP1.setFitHeight(207);
			AprilP1.setFitWidth(276);
			AprilP2.setVisible(true);
			AprilP2.setFitHeight(207);
			AprilP2.setFitWidth(276);
			break;
		case "May":
			MayP1.setFitHeight(207);
			MayP1.setFitWidth(276);
			MayP2.setVisible(true);
			MayP2.setFitHeight(207);
			MayP2.setFitWidth(276);
			break;
		case "June":
			JuneP1.setFitHeight(207);
			JuneP1.setFitWidth(276);
			JuneP2.setVisible(true);
			JuneP2.setFitHeight(207);
			JuneP2.setFitWidth(276);
			break;
		case "July":
			JulyP1.setFitHeight(207);
			JulyP1.setFitWidth(276);
			JulyP2.setVisible(true);
			JulyP2.setFitHeight(207);
			JulyP2.setFitWidth(276);
			break;
		case "August":
			AugustP1.setFitHeight(207);
			AugustP1.setFitWidth(276);
			AugustP2.setVisible(true);
			AugustP2.setFitHeight(207);
			AugustP2.setFitWidth(276);
			break;
		case "September":
			SeptemberP1.setFitHeight(207);
			SeptemberP1.setFitWidth(276);
			SeptemberP2.setVisible(true);
			SeptemberP2.setFitHeight(207);
			SeptemberP2.setFitWidth(276);
			break;
		case "October":
			OctoberP1.setFitHeight(207);
			OctoberP1.setFitWidth(276);
			OctoberP2.setVisible(true);
			OctoberP2.setFitHeight(207);
			OctoberP2.setFitWidth(276);
			break;
		case "November":
			NovemberP1.setFitHeight(207);
			NovemberP1.setFitWidth(276);
			NovemberP2.setVisible(true);
			NovemberP2.setFitHeight(207);
			NovemberP2.setFitWidth(276);
			break;
		case "December":
			DecemberP1.setFitHeight(207);
			DecemberP1.setFitWidth(276);
			DecemberP2.setVisible(true);
			DecemberP2.setFitHeight(207);
			DecemberP2.setFitWidth(276);
			break;
		}
	}

	/**
	 * @param event
	 * 
	 *            after the click the image chooser coms up and you can pick a
	 *            image from a folder and set the ImageView to the chosen image
	 */
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

	/**
	 * @param event
	 * 
	 *            after the click the image chooser coms up and you can pick a
	 *            image from a folder and set the ImageView to the chosen image
	 */
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

	public void export(ActionEvent event) {
		date = textjear.getText();
		try {
			Integer x = Integer.parseInt(textjear.getText());
			if (x <= 2000 || x <= 10000) {
				labelYear.setTextFill(Color.GREEN);
				String fileName = "Calendar_" + date + ".pdf";
				try {
					PDDocument doc = new PDDocument();
					PDPage page = new PDPage();
					PDPageContentStream content = new PDPageContentStream(doc, page);
					int i = 0;
					while (i <= 11) {
						doc.addPage(page);
						switch(i){
						case 0:
							month = "January";
							break;
						case 1:
							month = "Feburary";
							break;
						case 2:
							month = "March";
							break;
						case 3:
							month = "April";
							break;
						case 4:
							month = "May";
							break;
						case 5:
							month = "June";
							break;
						case 6:
							month = "July";
							break;
						case 7:
							month = "August";
							break;
						case 8:
							month = "September";
							break;
						case 9:
							month = "October";
							break;
						case 10:
							month = "November";
							break;
						case 11:
							month = "December";
							break;
						}
						
						content.beginText();
						content.setFont(PDType1Font.HELVETICA, 26);
						content.moveTextPositionByAmount(220, 750);
						content.drawString(month);
						content.endText();
						i++;
					}
					content.close();
					doc.save(fileName);
					doc.close();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			} else {
				labelYear.setTextFill(Color.RED);
			}
		} catch (

		NumberFormatException e) {
			labelYear.setTextFill(Color.RED);
		}
	}
}
