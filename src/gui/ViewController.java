package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class ViewController implements Initializable{
	
	
	@FXML
	private Button btSoma;
	@FXML
	private Button btSub;
	@FXML
	private Button btDiv;
	@FXML
	private Button btMult;

	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	@FXML
	private Label labelResult;
	
	
	
	@FXML
	public void onBtSomaAction() {
		
		try {
		Locale.setDefault(Locale.US);
		double num1= Double.parseDouble(txtNumber1.getText());
		double num2= Double.parseDouble(txtNumber2.getText());
		double result = num1+num2;
		labelResult.setText(String.format("%.2f",result));
		}
		catch (NumberFormatException e){
	
		}
	}
	
	@FXML
	public void onBtSubAction() {
		try {
			Locale.setDefault(Locale.US);
			double num1= Double.parseDouble(txtNumber1.getText());
			double num2= Double.parseDouble(txtNumber2.getText());
			double result = num1-num2;
			labelResult.setText(String.format("%.2f",result));
			}
			catch (NumberFormatException e){
		
			}
	}
	
	@FXML
	public void onBtDivAction() {
		try {
			Locale.setDefault(Locale.US);
			double num1= Double.parseDouble(txtNumber1.getText());
			double num2= Double.parseDouble(txtNumber2.getText());
			double result = num1/num2;
			labelResult.setText(String.format("%.2f",result));
			}
			catch (NumberFormatException e){
		
			}
		
	}
	
	@FXML
	public void onBtMultAction() {
		try {
			Locale.setDefault(Locale.US);
			double num1= Double.parseDouble(txtNumber1.getText());
			double num2= Double.parseDouble(txtNumber2.getText());
			double result = num1*num2;
			labelResult.setText(String.format("%.2f",result));
			}
			catch (NumberFormatException e){
		
			}
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		/*Constraints são as limitações dos botoes caixas de texto e etc*/
		Constraints.setTextFieldDouble(txtNumber1);
		Constraints.setTextFieldDouble(txtNumber2);
		Constraints.setTextFieldMaxLength(txtNumber1, 12);
		Constraints.setTextFieldMaxLength(txtNumber2, 12);
		
	}
	
	
}
