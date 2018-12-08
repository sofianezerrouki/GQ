package client;

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

public class ClientController implements Initializable {
    
    
    @FXML
    private JFXButton nouveau;
        @FXML
    private JFXButton modifier;
    
    @FXML
    void modifier(ActionEvent event) {
        Parent mainView = null;
            try {
                mainView = FXMLLoader.load(getClass().getResource("/client/manupilerClient/ModifierClient.fxml"));
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
            
            Stage mStage = (Stage) modifier.getScene().getWindow();
           //load main fenetre
            mStage.setScene(new Scene(mainView));
    }

    @FXML
    void nouveau(ActionEvent event) {
        Parent mainView = null;
            try {
                mainView = FXMLLoader.load(getClass().getResource("/client/manupilerClient/AjouterClient.fxml"));
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
            
            Stage mStage = (Stage) nouveau.getScene().getWindow();
           //load main fenetre
            mStage.setScene(new Scene(mainView));
    }

    @FXML
    void supprimer(ActionEvent event) {
        Parent mainView = null;
            try {
                mainView = FXMLLoader.load(getClass().getResource("/client/manupilerClient/SupprimerClient.fxml"));
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
            
            Stage mStage = (Stage) nouveau.getScene().getWindow();
           //load main fenetre
            mStage.setScene(new Scene(mainView));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}
