/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Parth Shah
 */
public class utils {
    
    
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception ex) {
            System.out.println("Error in loading Driver.");
        }
    }
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pizzabooking", "root", "root");
    }
    
    
}
