package baseDeDonnee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionDB {
    
      public static Connection con = null;
    
      public Connection  getconncion(){
                //load the driver
	try {
			Class.forName("com.mysql.jdbc.Driver");
			//establish the connection
            		con = DriverManager.getConnection("jdbc:mysql://localhost/gestioncommerciale", "root", "");
			
                        System.out.println("Database connection succes");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
                        
                        e.printStackTrace();
		} catch (SQLException ex) { 
                        Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
                } 
		 
                return con;
      }
}
