/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals.exceptions;

/**
 *
 * @author Jhony Naranjo
 */
public class Animal {
    public String eyes;
    
    public void eat() throws RuntimeException {
        System.out.println("The animal eyes "+eyes.toString());
    }
    
    @Override
    public String toString(){
        return "I am Animal class";
    }
       
}
