package com.sofianezerrouki.gestion_commercial.gui.client.manupilerClient;

import com.sofianezerrouki.gestion_commercial.baseDeDonnee.ConnectionDB;
import static com.sofianezerrouki.gestion_commercial.baseDeDonnee.ConnectionDB.con;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
public class AjouterClientController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    
    String requete = null;
    String societeS,nomclietnS,prenomclientS,adresseS,codepostaleS,
            paysS,villeS,telephoneS,mobileS,faxS,emailS,typeS,saisileS,saisiparS,
            auteurModif,fmadresseS,lmadresseS,exemptS;

    public String getSociete() {
        return societe.getText();
    }

    public String getNomclietn() {
        return nomclietn.getText();
    }

    public String getPrenomclient() {
        return prenomclient.getText();
    }

    public String getAdresse() {
        return adresse.getText();
    }

    public String getCodepostale() {
        return codepostale.getText();
    }

    public String getPays() {
        return pays.getText();
    }

    public String getVille() {
        return ville.getText();
    }

    public String getTelephone() {
        return telephone.getText();
    }

    public String getMobile() {
        return mobile.getText();
    }

    public String getFax() {
        return fax.getText();
    }

    public String getEmail() {
        return email.getText();
    }

    public String getType() {
        return type.getText();
    }

    public String getSaisile() {
        return saisile.getText();
    }

    public String getSaisipar() {
        return saisipar.getText();
    }

    public String getFmadresse() {
        return fmadresse.getText();
    }

    public String getLmadresse() {
        return lmadresse.getText();
    }

    public String getExempt() {
        return exempt.getText();
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
    void Reset(ActionEvent event) {

    }

    @FXML
    void save() {
         
          Statement st = null;
        try {
            st = con.createStatement();
             st.executeQuery("insert into client (fax) values ('046020202')");
             
             
        } catch (SQLException ex) {
            System.out.println("kayn erreure");
        }
       
         
    }
    String getnom(){
        return nomclietn.getText();
    }
    
    private boolean insertData(){
        
        return false;
    }
}
