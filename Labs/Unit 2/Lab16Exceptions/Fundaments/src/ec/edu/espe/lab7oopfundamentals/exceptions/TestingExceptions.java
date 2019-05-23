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
public class TestingExceptions {
    public static void main(String[] args) {
        Animal animal = null;
        try{
          System.out.println("The animal eyes are ->"+animal.eyes);

        }catch(Exception ex){
            System.err.println("No animals in the system, "
                    + "communicate to the admin and talk funcionality with error->"+ex.getMessage());
            System.err.println("No animals in the system, "
                    + "communicate to the admin and talk funcionality with error->"+ex);
        }
    }
}
