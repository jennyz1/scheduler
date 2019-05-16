package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class individualProfileClass implements Initializable {
	@FXML AnchorPane mainAnchorPane;
	@FXML ChoiceBox<String> dayChoiceBox;
	@FXML ChoiceBox<String> shiftChoiceBox;
	@FXML TextField commentField;
	@FXML Button addPreferenceButton;
	@FXML Button editPreferenceButton;
	@FXML Button editEmployeeInfoButton;
	@FXML Button deleteEmployeeButton;

	@Override
	public void initialize(URL url, ResourceBundle resources){
		dayChoiceBox.getItems().addAll(
				"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
			);
		dayChoiceBox.getSelectionModel().selectFirst();
		shiftChoiceBox.getItems().addAll(
				"Morning","Day","Night"
				);
		shiftChoiceBox.getSelectionModel().selectFirst();
	}

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

}