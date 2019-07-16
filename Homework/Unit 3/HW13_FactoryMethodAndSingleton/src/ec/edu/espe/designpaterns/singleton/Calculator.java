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
public class Calculator {
    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        tax.salesTotal();
        System.out.println(tax.salesTotal());
    }
}
