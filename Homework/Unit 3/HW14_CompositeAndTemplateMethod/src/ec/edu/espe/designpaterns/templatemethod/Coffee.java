/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.designpaterns.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhony Naranjo
 */
public class Coffee extends CaffeineBeverage{
    public void brew(){
        System.out.println("Dripping coffee through filter");
    }
    
    public void addCondiments(){
        System.out.println("Adding sugar and milk");
    }
    
    public boolean wantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }
    
    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk and sugar wuith your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Coffee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;
    }
}
