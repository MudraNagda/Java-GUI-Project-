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
public class Pizza {
    @Getter
    @Setter
    int id;
    
    @Getter
    @Setter
    String name;
    
    @Getter
    @Setter
    int amount;

    public Pizza(int id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
}
