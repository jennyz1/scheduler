package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class profileClass {

	@FXML Button addEmployeeButton;
	@FXML ChoiceBox<String> employeeStatusChoiceBox;

	@FXML TextField firstNameField;
	@FXML TextField lastNameField;
	@FXML ChoiceBox<String> addEmployeeStatusChoiceBox;
	@FXML Button saveEmployeeButton;

	@FXML
	private void homeButtonAction(ActionEvent event) throws IOException {
		Parent homepane = FXMLLoader.load(getClass().getResource("scheduler.fxml"));
		Scene homeScene = new Scene(homepane);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(homeScene);
		app_stage.show();
	}

	@FXML
	private void profileButtonAction(ActionEvent event) throws IOException {
		employeeStatusChoiceBox.getItems().add("Choice 1");
	    employeeStatusChoiceBox.getItems().add("Choice 2");

	    Parent profilepane = FXMLLoader.load(getClass().getResource("profile.fxml"));
		Scene profileScene = new Scene(profilepane);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(profileScene);
		app_stage.show();
	}

	@FXML
	private void buildButtonAction(ActionEvent event) throws IOException {
		Parent builderpane = FXMLLoader.load(getClass().getResource("builder.fxml"));
		Scene builderScene = new Scene(builderpane);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(builderScene);
		app_stage.show();
	}

	@FXML
	private void viewButtonAction(ActionEvent event) throws IOException {
		Parent viewpane = FXMLLoader.load(getClass().getResource("view.fxml"));
		Scene viewScene = new Scene(viewpane);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(viewScene);
		app_stage.show();
	}
	@FXML
	private void settingsButtonAction(ActionEvent event) throws IOException {
		Parent settingspane = FXMLLoader.load(getClass().getResource("settings.fxml"));
		Scene settingsScene = new Scene(settingspane);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(settingsScene);
		app_stage.show();
	}

	@FXML
	private void addEmployeeButtonAction(ActionEvent event) throws IOException {
		firstNameField.setVisible(true);
		lastNameField.setVisible(true);
		addEmployeeStatusChoiceBox.setVisible(true);
		saveEmployeeButton.setVisible(true);
	}
	@FXML
	private void saveEmployeeButtonAction(ActionEvent event) throws IOException {
		firstNameField.setVisible(false);
		lastNameField.setVisible(false);
		addEmployeeStatusChoiceBox.setVisible(false);
		saveEmployeeButton.setVisible(false);
	}
}