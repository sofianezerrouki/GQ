package com.sofianezerrouki.gestion_commercial.gui.client;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientController {

    @FXML
    private JFXButton nouveau;
    @FXML
    private JFXButton modifier;

    @FXML
    private void modifier() {
        Parent modifierClientView = null;
        try {
            modifierClientView = FXMLLoader.load(getClass().getResource("/com/sofianezerrouki/gestion_commercial/gui/client/manupilerClient/ModifierClient.fxml"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Stage mStage = (Stage) modifier.getScene().getWindow();
        //load main fenetre
        mStage.setScene(new Scene(modifierClientView));
    }

    @FXML
    private void nouveau() { // New Client
        Parent ajouterClientView = null;
        try {
            ajouterClientView = FXMLLoader.load(getClass().getResource("/com/sofianezerrouki/gestion_commercial/gui/client/manupilerClient/AjouterClient.fxml"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Stage mStage = (Stage) nouveau.getScene().getWindow();
        //load main fenetre
        mStage.setScene(new Scene(ajouterClientView));
    }

    @FXML
    private void supprimer() { // Delete Client
        Parent supprimerClientView = null;
        try {
            supprimerClientView = FXMLLoader.load(getClass().getResource("/com/sofianezerrouki/gestion_commercial/gui/client/manupilerClient/SupprimerClient.fxml"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Stage mStage = (Stage) nouveau.getScene().getWindow();
        //load main fenetre
        mStage.setScene(new Scene(supprimerClientView));
    }
}
