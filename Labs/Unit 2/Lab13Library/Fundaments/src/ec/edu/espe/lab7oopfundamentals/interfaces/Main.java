    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals.interfaces;

/**
 *
 * @author Jhony Naranjo
 */
public class Main {

    public static void main(String[] args) {
        Animal animal;
        animal = new Horse(60);
        animal.run();
        animal.sound();
        animal.sleep(1500);
       

    }
}