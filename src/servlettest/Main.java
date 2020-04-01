/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlettest;

import java.sql.*;

/**
 *
 * @author pbone
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String DRIVER = "com.mysql.jdbc.Driver";
         Class.forName(DRIVER);
         
         String URL_mioDB = "jdbc:mysql://localhost:3306/fi_itis_meucci";
         String query = "select * from class";
         
         Connection connessione = null;
         connessione = DriverManager.getConnection(URL_mioDB, "bonex","pietro001");
         
         Statement statement = connessione.createStatement();
         ResultSet resultset = statement.executeQuery(query);
         while(resultset.next())
         {
             System.out.println("Classe: " + resultset.getString(3));
         }
         
    }
    
}
