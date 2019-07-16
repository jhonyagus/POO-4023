/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals;
import ec.edu.espe.lab7oopfundamentals.inheritance.Animal;
import ec.edu.espe.lab7oopfundamentals.inheritance.Mammal;

/**
 *
 * @author Jhony Naranjo
 */
public class OppFundamentals {
    public static void main(String[] args) {
        Animal animal;
        animal = new Mammal(2,4, "Lucy");
        animal.print();
        System.out.println(animal);
        
        Mammal mammal = new Mammal(2,4,"Firulais");
        mammal.print();
        mammal.stayWarm(); 
    } 
}
