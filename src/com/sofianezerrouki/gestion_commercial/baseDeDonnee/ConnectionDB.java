package com.sofianezerrouki.gestion_commercial.baseDeDonnee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public static Connection con = null;

    static {
        //load the driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //establish the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestioncommercialdb", "root", "");

            System.out.println("Database connection succes !");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver Error !");
            e.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("Connection Error !");
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        
    }
}
