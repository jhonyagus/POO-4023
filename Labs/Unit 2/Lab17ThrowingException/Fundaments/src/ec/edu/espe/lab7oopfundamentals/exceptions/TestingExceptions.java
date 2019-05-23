/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Lab17ThrowingExceptions
 */
package ec.edu.espe.lab7oopfundamentals.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

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
        System.out.println("The first try-cach passed");
        Animal animal2 = new Animal();
        animal2.eyes = null;
        
        try{
            animal2.eat();
        }catch(RuntimeException ex){
            System.out.println("This is the Stacktrace" );
            ex.printStackTrace();
            Logger.getLogger(TestingExceptions.class.getName()).log(Level.SEVERE, null, ex + "Jhony Naranjo");
            //System.out.println(getClass().getClassLoader().getResource("logging.properties"));
            System.out.println(ClassName.class.getClassLoader().getResource("logging.properties"));
        }
         System.out.println("The second try-catch passed");
    }

    private static class ClassName {

        public ClassName() {
        }
    }
}
