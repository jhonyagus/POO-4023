/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals.json;

import com.google.gson.Gson;
import ec.edu.espe.lab7oopfundamentals.inheritance.Lion;

/**
 *
 * @author Jhony Naranjo
 */
public class LionsSystem {
    public static void main(String[] args) {
        Lion lion = new Lion(true,true,3,4,"Lion_O");
        Gson gson = new Gson();
       
        String json;
        json = gson.toJson(lion);
        System.out.println(json);
        
        json = "{\"mane\":true,\"scary\":true,\"furThickness\":3,\"numberOfLegs\":4,\"name\":\"Lippy\"}";
        
        Lion lion2;
        lion2 = gson.fromJson(json, Lion.class);
        System.out.println(lion2);
        
    }
}
