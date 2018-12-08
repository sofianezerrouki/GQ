package client.manupilerClient;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author sof
 */
public class ModifierClientController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
      @FXML
    private JFXTextField societe;
    @FXML
    private JFXTextField nomclietn;
    @FXML
    private JFXTextField prenomclient;
    @FXML
    private JFXTextField adresse;
    @FXML
    private JFXTextField codepostale;
    @FXML
    private JFXTextField pays;
    @FXML
    private JFXTextField ville;
    @FXML
    private JFXTextField telephone;
    @FXML
    private JFXTextField mobile;
    @FXML
    private JFXTextField fax;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXTextField type;
    @FXML
    private JFXTextField saisile;
    @FXML
    private JFXTextField saisipar;
    @FXML
    private JFXCheckBox fmadresse;
    @FXML
    private JFXCheckBox lmadresse;
    @FXML
    private JFXCheckBox exempt;
    @FXML
    void anulerModif(ActionEvent event) {

    }

    @FXML
    void saveModif(ActionEvent event) {
        
    }
}
