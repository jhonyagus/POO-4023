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
public class President extends Supervisor{
    private static President president = new President();
    
    public void stateName(){
        super.stateName();
    }
    
    public President getPresident(String aName){
        president.name = aName;
        return President.president;
    }
    
    private President(String aName){
        this();
        name = aName;
    }
    
    private President(){
        super();
        title = "President";
    }
  
}
