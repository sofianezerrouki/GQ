package com.sofianezerrouki.gestion_commercial.gui.system;

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

public class SystemController implements Initializable {
    
    @FXML
    private JFXButton btnClient;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void clientBtn() {
        Parent clientView = null;
            try { // Get Client FXML
                clientView = FXMLLoader.load(getClass().getResource("/com/sofianezerrouki/gestion_commercial/gui/client/Client.fxml"));
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
            
            Stage mStage = (Stage) btnClient.getScene().getWindow();
           // load client FXML to window
            mStage.setScene(new Scene(clientView));
    }

    @FXML
    private void commandeBtn() {

    }

    @FXML
    private void factureBtn() {

    }

    @FXML
    private void fournisseureBtn() {
        
    }

    @FXML
    private void produitBtn() {
        Parent mainView = null;
            try {
                mainView = FXMLLoader.load(getClass().getResource("/produit/Produit.fxml"));
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
            
            Stage mStage = (Stage) btnClient.getScene().getWindow();
           //load main fenetre
            mStage.setScene(new Scene(mainView));
    }

    @FXML
    private void reglementBtn() {

    }
    
}
