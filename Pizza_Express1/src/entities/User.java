/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Parth Shah
 */
public class User {
    
    
    @Getter
    @Setter
    int id;
    
    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    String username;
    
    @Getter
    @Setter
    String password;

    public User(int id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    
}
