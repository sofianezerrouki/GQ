package baseDeDonnee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    public boolean checkLogin(String user, String pass) {
        ConnectionDB con = new ConnectionDB();
        if(con == null)
            return false;
        String sql = "SELECT * FROM login WHERE NomUtilisateure = ? AND MotDePasse = ?;";
        
        try {
            PreparedStatement prest = con.getconncion().prepareStatement(sql);
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
