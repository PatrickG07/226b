package src.ch.Class;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class StartController {
	
	@FXML
	public void edit(ActionEvent event){
		
	}
	
	@FXML
	public void create(ActionEvent event){
		Start.loadScene("Show");
	}
}
