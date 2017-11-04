/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static utilities.utils.getConnection;

/**
 *
 * @author Parth Shah
 */
public class UserDAO {
    
    public static void save(User user) {
        try (Connection connection = getConnection()) {

            PreparedStatement preparedStatement = connection.prepareStatement("insert into user(name,username,password) values(?,?,?);");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println("error couldnt save " + e.getMessage());
        }

    }
    
    public static User getUser(String theUsername, String thePassword) {
        try (Connection connection = getConnection()) {

            ResultSet resultSet = connection.createStatement().executeQuery("select * from user where username = \"" + theUsername + "\" and password = \"" + thePassword + "\";");

            resultSet.next();
            return new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));

        } catch (Exception e) {
            return null;
        }

    }
    
}
