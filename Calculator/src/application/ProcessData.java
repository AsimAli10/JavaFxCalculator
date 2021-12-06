package application;
import java.io.IOException;

import javafx.event.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.*;


public class ProcessData {
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	public Label result;
	public float n1;
	public float n2;
	private int count=0;
	public boolean start=true;
	public String operator="";
	@FXML
	private TextField Weight;
	@FXML
	private TextField Height;
	@FXML
	private Label result2;
	@FXML
    private TextField OPrice;
    @FXML
    private TextField OOff;
    @FXML
    private Label FPrice;
    @FXML
    private Label saved;
    @FXML
    private DatePicker DOB;
    @FXML
    private DatePicker CD;
    @FXML
    private Label years;
    @FXML
    private Label months;
    @FXML
    private Label days;
    @FXML
    private TextField InvAmount;
    @FXML
    private TextField Duration;
    @FXML
    private TextField Interest;
    @FXML
    private Label Result3;
    @FXML
    private ChoiceBox<String> FROM;
    @FXML
    private ChoiceBox<String> TO;
    @FXML
    private TextField ValueToBeConverted;
    @FXML
    private TextField ConvertedCurrency;
	@FXML
	public void processNumbers(ActionEvent event)
	{
		if(start)
		{
			result.setText("");
			start=false;
		}
		String value=((Button)event.getSource()).getText();
		result.setText(result.getText()+value);
	}
	public void processOperator(ActionEvent event)
	{
		Calculator temp=new Calculator();
		String value=((Button)event.getSource()).getText();
		if(!value.equals("="))
		{
			if(!operator.isEmpty())
			
				switch(value)
				{
				case "C":
					result.setText("");
					this.n1=0;
					this.n2=0;
					break;
				default:
					break; 
				}
				operator=value;
				n1=Long.parseLong(result.getText());
				result.setText("");
				return;
		}
			else
			{
				if(operator.isEmpty())
					return;
				n2=Long.parseLong(result.getText());
				float out=temp.calculator(n1, n2, operator);
				result.setText(String.valueOf(out));
				operator="";
				n1=0;
				n2=0;
				start=true;
			}
		
	}
	@FXML
	public void MainMenu(ActionEvent event)
	{
		try {
			root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
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
	public void CalculateBMI(ActionEvent event)
	{
		String weight= Weight.getText();
		String height=Height.getText();
		BMI B=new BMI();
		float res=B.CalculateBMI(Float.parseFloat(weight), Float.parseFloat(height));
		result2.setText(String.valueOf(res));
	}
	@FXML
	public void CalculateDiscount(ActionEvent event)
	{
		String Price= OPrice.getText();
		String Dis=OOff.getText();
		Discount D=new Discount();
		float res=D.calculateDiscount(Float.parseFloat(Price), Float.parseFloat(Dis));
		float S=D.calculateSavedAmount(Float.parseFloat(Price), Float.parseFloat(Dis));
		FPrice.setText(String.valueOf(res));
		saved.setText(String.valueOf(S));
	}
	@FXML
	public void CalculateAge(ActionEvent event)
	{
		String DateOfBirth= DOB.getValue().toString();
		String CurrDate=CD.getValue().toString();
		Age A=new Age();
		System.out.println(DateOfBirth);
		System.out.println(CurrDate);
		int arr[]=new int[2];
		arr=A.CalculateAge(DateOfBirth, CurrDate);
		years.setText(Integer.toString(arr[2]));
		months.setText(Integer.toString(arr[1]));
		days.setText(Integer.toString(arr[0]));
		
	}
	@FXML
	public void CalculateInvestment(ActionEvent event)
	{
		double Amount=Double.valueOf(InvAmount.getText());
		double Ints=Double.valueOf(Interest.getText());
		double Dur=Double.valueOf(Duration.getText());
		Investment In=new Investment();
		double res=In.CalculateAmount(Amount, Ints, Dur);
		Result3.setText(Double.toString(res));
	}
	@FXML
	public void CalculateCurrency(ActionEvent event)
	{
		String Fr=FROM.getValue();
		String T=TO.getValue();
		double amon=Double.valueOf(ValueToBeConverted.getText());
		Currency C=new Currency();
		double res=C.Convert(Fr, T, amon);
		ConvertedCurrency.setText(Double.toString(res));
	}
	@FXML
	public void StartCurrencyCalculator(ActionEvent event)
	{
		if(count==0)
		{
			FROM.getItems().add("PKR");
			FROM.getItems().add("USD");
			FROM.getItems().add("EUR");
			TO.getItems().add("PKR");
			TO.getItems().add("USD");
			TO.getItems().add("EUR");
			count++;
		}
	}
}
