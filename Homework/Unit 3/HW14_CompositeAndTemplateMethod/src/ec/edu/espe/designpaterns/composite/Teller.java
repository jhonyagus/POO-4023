/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.designpaterns.composite;

/**
 *
 * @author Jhony Naranjo
 */
public class Teller extends Employee{
    
    public void stateName(){
        super.stateName();
    }
    
    public Teller(String aName){
        this();
        name = aName;
    }
    
    public Teller(){
        title = "Teller";
    }
}
