package src.ch.Class;
/**
 * @author Patrick Gartenmann
 */
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
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

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
	int JanuaryT = 2;
	int FeburaryT = 2;
	int MarchT = 2;
	int AprilT = 2;
	int MayT = 2;
	int JuneT = 2;
	int JulyT = 2;
	int AugustT = 2;
	int SeptemberT = 2;
	int OctoberT = 2;
	int NovemberT = 2;
	int DecemberT = 2;

	/**
	 * @param event
	 * 
	 *            sets the imageView 1 to the size 207 and 570 and disable the
	 *            imageView 2 for the open Month
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
			JanuaryT = 1;
			break;
		case "Feburary":
			FeburaryP1.setFitHeight(207);
			FeburaryP1.setFitWidth(570);
			FeburaryP2.setVisible(false);
			FeburaryT = 1;
			break;
		case "March":
			MarchP1.setFitHeight(207);
			MarchP1.setFitWidth(570);
			MarchP2.setVisible(false);
			MarchT = 1;
			break;
		case "April":
			AprilP1.setFitHeight(207);
			AprilP1.setFitWidth(570);
			AprilP2.setVisible(false);
			AprilT = 1;
			break;
		case "May":
			MayP1.setFitHeight(207);
			MayP1.setFitWidth(570);
			MayP2.setVisible(false);
			MayT = 1;
			break;
		case "June":
			JuneP1.setFitHeight(207);
			JuneP1.setFitWidth(570);
			JuneP2.setVisible(false);
			JuneT = 1;
			break;
		case "July":
			JulyP1.setFitHeight(207);
			JulyP1.setFitWidth(570);
			JulyP2.setVisible(false);
			JulyT = 1;
			break;
		case "August":
			AugustP1.setFitHeight(207);
			AugustP1.setFitWidth(570);
			AugustP2.setVisible(false);
			AugustT = 1;
			break;
		case "September":
			SeptemberP1.setFitHeight(207);
			SeptemberP1.setFitWidth(570);
			SeptemberP2.setVisible(false);
			SeptemberT = 1;
			break;
		case "October":
			OctoberP1.setFitHeight(207);
			OctoberP1.setFitWidth(570);
			OctoberP2.setVisible(false);
			OctoberT = 1;
			break;
		case "November":
			NovemberP1.setFitHeight(207);
			NovemberP1.setFitWidth(570);
			NovemberP2.setVisible(false);
			NovemberT = 1;
			break;
		case "December":
			DecemberP1.setFitHeight(207);
			DecemberP1.setFitWidth(570);
			DecemberP2.setVisible(false);
			DecemberT = 1;
			break;
		}
	}

	/**
	 * @param event
	 * 
	 *            sets the imageView 1 to the size 207 and 276 and the imageView
	 *            2 to the same size for the open Month
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
			JanuaryT = 2;
			break;
		case "Feburary":
			FeburaryP1.setFitHeight(207);
			FeburaryP1.setFitWidth(276);
			FeburaryP2.setVisible(true);
			FeburaryP2.setFitHeight(207);
			FeburaryP2.setFitWidth(276);
			FeburaryT = 2;
			break;
		case "March":
			MarchP1.setFitHeight(207);
			MarchP1.setFitWidth(276);
			MarchP2.setVisible(true);
			MarchP2.setFitHeight(207);
			MarchP2.setFitWidth(276);
			MarchT = 2;
			break;
		case "April":
			AprilP1.setFitHeight(207);
			AprilP1.setFitWidth(276);
			AprilP2.setVisible(true);
			AprilP2.setFitHeight(207);
			AprilP2.setFitWidth(276);
			AprilT = 2;
			break;
		case "May":
			MayP1.setFitHeight(207);
			MayP1.setFitWidth(276);
			MayP2.setVisible(true);
			MayP2.setFitHeight(207);
			MayP2.setFitWidth(276);
			MayT = 2;
			break;
		case "June":
			JuneP1.setFitHeight(207);
			JuneP1.setFitWidth(276);
			JuneP2.setVisible(true);
			JuneP2.setFitHeight(207);
			JuneP2.setFitWidth(276);
			JuneT = 2;
			break;
		case "July":
			JulyP1.setFitHeight(207);
			JulyP1.setFitWidth(276);
			JulyP2.setVisible(true);
			JulyP2.setFitHeight(207);
			JulyP2.setFitWidth(276);
			JulyT = 2;
			break;
		case "August":
			AugustP1.setFitHeight(207);
			AugustP1.setFitWidth(276);
			AugustP2.setVisible(true);
			AugustP2.setFitHeight(207);
			AugustP2.setFitWidth(276);
			AugustT = 2;
			break;
		case "September":
			SeptemberP1.setFitHeight(207);
			SeptemberP1.setFitWidth(276);
			SeptemberP2.setVisible(true);
			SeptemberP2.setFitHeight(207);
			SeptemberP2.setFitWidth(276);
			SeptemberT = 2;
			break;
		case "October":
			OctoberP1.setFitHeight(207);
			OctoberP1.setFitWidth(276);
			OctoberP2.setVisible(true);
			OctoberP2.setFitHeight(207);
			OctoberP2.setFitWidth(276);
			OctoberT = 2;
			break;
		case "November":
			NovemberP1.setFitHeight(207);
			NovemberP1.setFitWidth(276);
			NovemberP2.setVisible(true);
			NovemberP2.setFitHeight(207);
			NovemberP2.setFitWidth(276);
			NovemberT = 2;
			break;
		case "December":
			DecemberP1.setFitHeight(207);
			DecemberP1.setFitWidth(276);
			DecemberP2.setVisible(true);
			DecemberP2.setFitHeight(207);
			DecemberP2.setFitWidth(276);
			DecemberT = 2;
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

	/**
	 * @param event
	 * 
	 *            create a PDF with the PDFBox for every Month and creates the
	 *            Calendar under it
	 *            The PDF export works but the Picture are not the corect one and the Calendar under it does not create 
	 */
	@SuppressWarnings("deprecation")
	public void export(ActionEvent event) {
		date = textjear.getText();
		try {
			Integer x = Integer.parseInt(textjear.getText());
			if (x <= 1000 || x <= 10000) {
				labelYear.setTextFill(Color.GREEN);
				String fileName = "Calendar_" + date + ".pdf";
				try {
					PDDocument doc = new PDDocument();
					PDPage page1 = new PDPage();
					PDPageContentStream content1 = new PDPageContentStream(doc, page1);
					doc.addPage(page1);
					content1.beginText();
					content1.setFont(PDType1Font.HELVETICA, 26);
					content1.moveTextPositionByAmount(220, 650);
					content1.drawString("Caledar");
					content1.endText();

					content1.beginText();
					content1.setFont(PDType1Font.HELVETICA, 26);
					content1.moveTextPositionByAmount(220, 500);
					content1.drawString("Year: " + textjear.getText());
					content1.endText();
					content1.close();
					int i = 0;
					while (i <= 11) {
						PDPage page = new PDPage();
						PDPageContentStream content = new PDPageContentStream(doc, page);
						doc.addPage(page);
						Image PictrueI1 = null;
						String Picture1;
						Image PictrueI2 = null;
						String Picture2;
						int template = 0;
						switch (i) {
						case 0:
							month = "January";
							PictrueI1 = JanuaryP1.getImage();
							if (JanuaryT == 1) {
								template = 1;
							} else if (JanuaryT == 2) {
								PictrueI2 = JanuaryP2.getImage();
								template = 2;
							}
							break;
						case 1:
							month = "Feburary";
							PictrueI1 = FeburaryP1.getImage();
							if (FeburaryT == 1) {
								template = 1;
							} else if (FeburaryT == 2) {
								PictrueI2 = FeburaryP2.getImage();
								template = 2;
							}
							break;
						case 2:
							month = "March";
							PictrueI1 = MarchP1.getImage();
							if (MarchT == 1) {
								template = 1;
							} else if (MarchT == 2) {
								PictrueI2 = MarchP2.getImage();
								template = 2;
							}
							break;
						case 3:
							month = "April";
							PictrueI1 = AprilP1.getImage();
							if (AprilT == 1) {
								template = 1;
							} else if (AprilT == 2) {
								PictrueI2 = AprilP2.getImage();
								template = 2;
							}
							break;
						case 4:
							month = "May";
							PictrueI1 = MayP1.getImage();
							if (MayT == 1) {
								template = 1;
							} else if (MayT == 2) {
								PictrueI2 = MayP2.getImage();
								template = 2;
							}
							break;
						case 5:
							month = "June";
							PictrueI1 = JuneP1.getImage();
							if (JuneT == 1) {
								template = 1;
							} else if (JuneT == 2) {
								PictrueI2 = JuneP2.getImage();
								template = 2;
							}
							break;
						case 6:
							month = "July";
							PictrueI1 = JulyP1.getImage();
							if (JulyT == 1) {
								template = 1;
							} else if (JulyT == 2) {
								PictrueI2 = JulyP2.getImage();
								template = 2;
							}
							break;
						case 7:
							month = "August";
							PictrueI1 = AugustP1.getImage();
							if (AugustT == 1) {
								template = 1;
							} else if (AugustT == 2) {
								PictrueI2 = AugustP2.getImage();
								template = 2;
							}
							break;
						case 8:
							month = "September";
							PictrueI1 = SeptemberP1.getImage();
							if (SeptemberT == 1) {
								template = 1;
							} else if (SeptemberT == 2) {
								PictrueI2 = SeptemberP2.getImage();
								template = 2;
							}
							break;
						case 9:
							month = "October";
							PictrueI1 = OctoberP1.getImage();
							if (OctoberT == 1) {
								template = 1;
							} else if (OctoberT == 2) {
								PictrueI2 = OctoberP2.getImage();
								template = 2;
							}
							break;
						case 10:
							month = "November";
							PictrueI1 = NovemberP1.getImage();
							if (NovemberT == 1) {
								template = 1;
							} else if (NovemberT == 2) {
								PictrueI2 = NovemberP2.getImage();
								template = 2;
							}
							break;
						case 11:
							month = "December";
							PictrueI1 = DecemberP1.getImage();
							if (DecemberT == 1) {
								template = 1;
							} else if (DecemberT == 2) {
								PictrueI2 = DecemberP2.getImage();
								template = 2;
							}
							break;
						}
						content.beginText();
						content.setFont(PDType1Font.HELVETICA, 26);
						content.moveTextPositionByAmount(220, 750);
						content.drawString(month);
						content.endText();

						if (template == 1) {
							// File file = new File(PictrueI1);
							String test = "";
							PDImageXObject pdImage = PDImageXObject.createFromFile(test, doc);
							content.drawXObject(pdImage, 30, 300, 550, 300);
						} else if (template == 2) {
							String test = "";
							PDImageXObject pdImage = PDImageXObject.createFromFile(test, doc);
							content.drawXObject(pdImage, 300, 300, 270, 300);

							String test2 = "";
							PDImageXObject pdImage2 = PDImageXObject.createFromFile(test2, doc);
							content.drawXObject(pdImage2, 30, 300, 270, 300);
						}
						i++;
						content.close();
					}
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
