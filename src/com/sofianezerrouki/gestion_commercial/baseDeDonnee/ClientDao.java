package com.sofianezerrouki.gestion_commercial.baseDeDonnee;

import com.sofianezerrouki.gestion_commercial.baseDeDonnee.models.Client;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientDao {
    public static boolean addClient(Client client) {
        String sql = "INSERT INTO Client (`Societe`, `Civilite`, `NomClient`, `Prenom`, `Adresse`, `CodePostal`, `Ville`, `Pays`, `Telephone`, `Mobile`, `Fax`, `Email`, `Type`, `LivreMemeAdresse`, `FactureMemeAdresse`, `ExemptTva`, `SaisiPar`, `SaisiLe`, `AuteurModif`, `DateModif`, `Observations`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            if(ConnectionDB.con == null)
                return false;

            PreparedStatement prest = ConnectionDB.con.prepareStatement(sql);
            prest.setString(1, client.getSociete());
            prest.setString(2, client.getCivilite());
            prest.setString(3, client.getNomClient());
            prest.setString(4, client.getPrenom());
            prest.setString(5, client.getAdresse());
            prest.setString(6, client.getCodePostal());
            prest.setString(7, client.getVille());
            prest.setString(8, client.getPays());
            prest.setString(9, client.getTelephone());
            prest.setString(10, client.getMobile());
            prest.setString(11, client.getFax());
            prest.setString(12, client.getEmail());
            prest.setInt(13, client.getType());
            prest.setBoolean(14, client.isLivreMemeAdresse());
            prest.setBoolean(15, client.isFactureMemeAdresse());
            prest.setBoolean(16, client.isExemptTva());
            prest.setString(17, client.getSaisiPar());
            prest.setDate(18, new java.sql.Date(client.getSaisiLe().getTime()));
            prest.setString(19, client.getAuteurModif());
            prest.setDate(20, new java.sql.Date(client.getDateModif().getTime()));
            prest.setString(21, client.getObservations());

            int status = prest.executeUpdate();
            
        } catch (SQLException se) {
            System.out.println("Add Client Error SQL");
            se.printStackTrace();
            return false;
        }
        
        return true;
    }
}
