/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.designpaterns.singleton;

/**
 *
 * @author Jhony Naranjo
 */
public class USTax {
    private static USTax instance;
    private USTax(){
        
    };
    
    public static USTax getInstance(){
        if(instance == null)
            instance = new USTax();
        return instance;
    }
    
    public float salesTotal(){
        return 12;
    }
}
