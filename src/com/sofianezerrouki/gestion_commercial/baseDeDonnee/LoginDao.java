package com.sofianezerrouki.gestion_commercial.baseDeDonnee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    public boolean checkLogin(String user, String pass) {
        String sql = "SELECT * FROM login WHERE NomUtilisateur = ? AND MotDePasse = ?;";
        
        try {
            PreparedStatement prest = ConnectionDB.con.prepareStatement(sql);
            prest.setString(1, user);
            prest.setString(2, pass);
            ResultSet rs = prest.executeQuery();
            if(rs.next())
                return true;
        } catch(SQLException se) {
            se.printStackTrace();
        } 
        return false;
    }
}
