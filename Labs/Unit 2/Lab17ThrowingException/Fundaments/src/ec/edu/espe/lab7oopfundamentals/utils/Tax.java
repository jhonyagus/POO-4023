/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals.utils;

/**
 *
 * @author Jhony Naranjo
 */
public class Tax {
    
    public static float computeIva(float base){
        float iva;
        iva = base*0.12F;
        return iva;
    }
    
    public static float computeTotal(float base){
        float total;
        total = base + computeIva(base);
        return total;
    }
}
