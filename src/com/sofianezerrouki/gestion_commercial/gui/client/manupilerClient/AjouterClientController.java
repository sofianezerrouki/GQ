package com.sofianezerrouki.gestion_commercial.gui.client.manupilerClient;

import com.sofianezerrouki.gestion_commercial.baseDeDonnee.ConnectionDB;
import static com.sofianezerrouki.gestion_commercial.baseDeDonnee.ConnectionDB.con;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.sofianezerrouki.gestion_commercial.baseDeDonnee.ClientDao;
import com.sofianezerrouki.gestion_commercial.baseDeDonnee.models.Client;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class AjouterClientController implements Initializable {

    /* Client Informations */
    
    @FXML
    private JFXTextField societe, civilite, nomclient, prenomclient, adresse, codepostale, pays, ville, telephone, mobile,
            fax, email, type;
    @FXML
    private JFXCheckBox fmadresse, lmadresse, exempt;
    @FXML
    private JFXTextArea observations;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void onVider() {
        societe.setText(null);
        nomclient.setText(null);
        prenomclient.setText(null);
        adresse.setText(null);
        codepostale.setText(null);
        pays.setText(null);
        ville.setText(null);
        telephone.setText(null);
        mobile.setText(null);
        fax.setText(null);
        email.setText(null);
        type.setText(null);
        
        fmadresse.setSelected(false);
        lmadresse.setSelected(false);
        exempt.setSelected(false);
        
        observations.setText(null);
    }

    @FXML
    void onSave() {
        Client client = new Client(societe.getText(), civilite.getText(), nomclient.getText(), prenomclient.getText(),
        adresse.getText(), codepostale.getText(), ville.getText(), pays.getText(), telephone.getText(), mobile.getText(),
        fax.getText(), email.getText(),(type.getText() == null || type.getText().isEmpty()) ? 0 : Integer.parseInt(type.getText()), lmadresse.isSelected(), fmadresse.isSelected(),
        exempt.isSelected(), "Sofiane", new Date(), "Sofiane", new Date(), observations.getText());
        
        boolean isInserted = ClientDao.addClient(client);
        
        if(isInserted)
            System.out.println("Inserted !");
        else
            System.out.println("Not Inserted !");
            
    }

}
