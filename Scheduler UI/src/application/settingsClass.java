package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class settingsClass {
	@FXML TextField locationNameField;
	@FXML TextField locationOpenField;
	@FXML TextField locationCloseField;
	@FXML TextField locationDurationField;
	@FXML TextField emailField;
	@FXML Button locationSaveButton;
	@FXML Button editLocationButton;
	@FXML Button resetYearButton;
	@FXML Button addLocationButton;
	@FXML Button deleteLocationButton;
	@FXML Button saveEmailButton;

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
	private void addLocationButtonAction(ActionEvent event) throws IOException {
		locationNameField.setVisible(true);
		locationOpenField.setVisible(true);
		locationCloseField.setVisible(true);
		locationDurationField.setVisible(true);
		locationSaveButton.setVisible(true);
	}
	@FXML
	private void locationSaveButtonAction(ActionEvent event) throws IOException {
		/*take text from the text field and save it how it needs to be saved*/
		locationNameField.setVisible(false);
		locationOpenField.setVisible(false);
		locationCloseField.setVisible(false);
		locationDurationField.setVisible(false);
		locationSaveButton.setVisible(false);
	}
	@FXML
	private void editLocationButtonAction(ActionEvent event) throws IOException {

	}
	@FXML
	private void saveEmailButtonAction(ActionEvent event) throws IOException {
		/*gets email from text field and saves it to where it needs to be saved*/
	}
	@FXML
	private void resetYearButtonAction(ActionEvent event) throws IOException {
		/*resets the scheduled hours*/
	}
}