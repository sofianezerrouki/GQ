/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_commerciale.client;

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

/**
 *
 * @author sof
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private JFXButton btnClient;
    @FXML
    void clientBtn(ActionEvent event) {
        Parent mainView = null;
            try {
                mainView = FXMLLoader.load(getClass().getResource("/client/Client.fxml"));
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
            
            Stage mStage = (Stage) btnClient.getScene().getWindow();
           //load main fenetre
            mStage.setScene(new Scene(mainView));
    }

    @FXML
    void commandeBtn(ActionEvent event) {

    }

    @FXML
    void factureBtn(ActionEvent event) {

    }

    @FXML
    void fournisseureBtn(ActionEvent event) {
        Parent mainView = null;
            try {
                mainView = FXMLLoader.load(getClass().getResource("/fournisseure/Fournisseure.fxml"));
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
            
            Stage mStage = (Stage) btnClient.getScene().getWindow();
           //load main fenetre
            mStage.setScene(new Scene(mainView));
    }

    @FXML
    void produitBtn(ActionEvent event) {
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
    void reglementBtn(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
