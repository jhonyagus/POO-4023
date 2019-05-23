/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals;

import ec.edu.espe.lab7oopfundamentals.utils.Tax;

/**
 *
 * @author Jhony Naranjo
 */
public class TestingStatics {
    public static void main(String[] args) {
        float price;
        float pvp;
        
        price = 10;
        pvp = Tax.computeIva(price);

        System.out.println("The pvp of "+price+" is "+pvp);
        System.out.println("The pvp of "+price+" is "+Tax.computeTotal(price));
    }
}
