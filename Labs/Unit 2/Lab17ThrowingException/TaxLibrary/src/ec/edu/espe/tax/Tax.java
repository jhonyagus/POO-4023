/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax;

/**
 *
 * @author Jhony Naranjo
 * @version 0.1.0
 * @since 2019-05-16
 *  
 */
public class Tax {
    
    /**
     * Receive the parameter base in dollars with two decimals for calculate iva
     * @param base 
     * @return 
     */
    public static float computeIva(float base){
        float iva;
        iva = base*0.12F;
        return iva;
    }
    
    /**
     * Receive the parameter base in dollars with two decimals for calculate pvp
     * @param base
     * @return pvp
     */
    public static float computeTotal(float base){
        float total;
        total = base + computeIva(base);
        return total;
    }
    
    
}
