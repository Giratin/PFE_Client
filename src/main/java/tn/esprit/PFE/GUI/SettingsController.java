/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.PFE.GUI;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Tryvl
 */
public class SettingsController implements Initializable {

    @FXML
    private StackPane rootContainer;
    @FXML
    private JFXTextField schoolName;
    @FXML
    private JFXTextField schoolAddress;
    @FXML
    private JFXTextField schoolWebsite;
    @FXML
    private JFXTextField serverName;
    @FXML
    private JFXTextField smtpPort;
    @FXML
    private JFXTextField emailAddress;
    @FXML
    private JFXPasswordField emailPassword;
    @FXML
    private JFXSpinner progressSpinner;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void updateSchool(ActionEvent event) {
    }

    @FXML
    private void handleTestMailAction(ActionEvent event) {
    }

    @FXML
    private void saveMailServerConfuration(ActionEvent event) {
    }

    @FXML
    private void handleDatabaseExportAction(ActionEvent event) {
    }
    
}
