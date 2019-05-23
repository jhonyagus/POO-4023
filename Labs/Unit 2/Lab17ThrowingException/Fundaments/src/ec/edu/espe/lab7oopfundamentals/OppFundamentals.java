/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals;
import ec.edu.espe.lab7oopfundamentals.inheritance.Animal;
import ec.edu.espe.lab7oopfundamentals.inheritance.Lion;
import ec.edu.espe.tax.Tax;
//import ec.edu.espe.lab7oopfundamentals.inheritance.Mammal;

/**
 *
 * @author Jhony Naranjo
 */
public class OppFundamentals {
    public static void main(String[] args) {
        Animal animal;
        animal = new Lion(true,true,3,4,"Alex");
        //animal.print();
        System.out.println(animal.getData());
        
        float money = 10;
        float moneyTax = 0;
        moneyTax = Tax.computeIva(money);
        System.out.println(moneyTax);
        
    } 
}
