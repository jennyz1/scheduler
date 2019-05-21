package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class profileClass implements Initializable{

	@FXML Button addEmployeeButton;
	@FXML ChoiceBox<String> employeeStatusChoiceBox;
	@FXML TextField firstNameField;
	@FXML TextField lastNameField;
	@FXML ChoiceBox<String> addEmployeeStatusChoiceBox;
	@FXML Button saveEmployeeButton;
	@FXML TableView<Employee> profileTable;
	@FXML Button openButton;
	@FXML public TableColumn<Employee, String> firstNameCol;
    @FXML public TableColumn<Employee, String> lastNameCol;
    @FXML public TableColumn<Employee, String> occupationCol;

	@Override
	public void initialize(URL url, ResourceBundle resources){
		employeeStatusChoiceBox.getItems().addAll(
				"All Employees",
				"Doctor",
			    "Moonlighter",
			    "PA"
			);
		employeeStatusChoiceBox.getSelectionModel().selectFirst();
		addEmployeeStatusChoiceBox.getItems().addAll(
				"Doctor",
			    "Moonlighter",
			    "PA"
			);
		addEmployeeStatusChoiceBox.getSelectionModel().selectFirst();
		firstNameCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("firstName"));
		lastNameCol.setCellValueFactory(new PropertyValueFactory<Employee, String>("lastName"));
		Employee employee = new Employee("Jenny", "Zhang",1,10);
		profileTable.getItems().add(employee);


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

	@FXML
	private void addEmployeeButtonAction(ActionEvent event) throws IOException {

		firstNameField.setVisible(true);
		lastNameField.setVisible(true);
		addEmployeeStatusChoiceBox.setVisible(true);
		saveEmployeeButton.setVisible(true);
	}

	@FXML
	private void openButtonAction(ActionEvent event) throws IOException {
		Employee selectedEmployee = profileTable.getSelectionModel().getSelectedItem();
		Parent settingspane = FXMLLoader.load(getClass().getResource("individualProfile.fxml"));
		Scene settingsScene = new Scene(settingspane);
		Stage app_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(settingsScene);
		app_stage.show();
	}


	@FXML
	private void saveEmployeeButtonAction(ActionEvent event) throws IOException {
		/*take text from the text field and save it how it needs to be saved*/
		if ((firstNameField.getText() == null || firstNameField.getText().trim().isEmpty())
			|| (lastNameField.getText() == null || lastNameField.getText().trim().isEmpty())) {
			Alert alert = new Alert(AlertType.INFORMATION);
	           alert.setTitle("Input fields empty");
	           alert.setContentText("Please fill all input fields");
	           alert.showAndWait();
		}
		else{
			/*Employee newEmployee = new Employee(firstNameField.getText(), lastNameField.getText(),
			 * 									  addEmployeeStatusChoiceBox.getValue());
				newEmployee.makeEmp(firstNameField.getText(), lastNameField.getText(),
			 * 									  addEmployeeStatusChoiceBox.getValue());
			 */
			Employee employee = new Employee(firstNameField.getText(),lastNameField.getText(),1,10);
			profileTable.getItems().add(employee);

			firstNameField.clear();
			lastNameField.clear();
			firstNameField.setVisible(false);
			lastNameField.setVisible(false);
			addEmployeeStatusChoiceBox.setVisible(false);
			saveEmployeeButton.setVisible(false);
		}
	}
}