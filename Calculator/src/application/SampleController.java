package application;
import java.io.IOException;

import javafx.event.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.*;

public class SampleController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	public void investment(ActionEvent event)
	{
		try {
			root = FXMLLoader.load(getClass().getResource("Investment.fxml"));
			 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			  scene = new Scene(root);
			  stage.setScene(scene);
			  stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	@FXML
	public void Calculator(ActionEvent event)
	{
		try {
			root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
			 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			  scene = new Scene(root);
			  stage.setScene(scene);
			  stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	@FXML
	public void BMI(ActionEvent event)
	{
		try {
			root = FXMLLoader.load(getClass().getResource("BMI.fxml"));
			 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			  scene = new Scene(root);
			  stage.setScene(scene);
			  stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	@FXML
	public void Currency(ActionEvent event)
	{
		try {
			root = FXMLLoader.load(getClass().getResource("Currency.fxml"));
			 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			  scene = new Scene(root);
			  stage.setScene(scene);
			  stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	@FXML
	public void Discount(ActionEvent event)
	{
		try {
			root = FXMLLoader.load(getClass().getResource("Discount.fxml"));
			 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			  scene = new Scene(root);
			  stage.setScene(scene);
			  stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	@FXML
	public void Age(ActionEvent event)
	{
		try {
			root = FXMLLoader.load(getClass().getResource("Age.fxml"));
			 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			  scene = new Scene(root);
			  stage.setScene(scene);
			  stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
