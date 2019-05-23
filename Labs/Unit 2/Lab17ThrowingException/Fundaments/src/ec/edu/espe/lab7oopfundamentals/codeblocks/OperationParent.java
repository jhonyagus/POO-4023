/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals.codeblocks;

/**
 *
 * @author Jhony Naranjo
 */
public class OperationParent {
    public OperationParent(){
        System.out.println("Constructor Parent executed");
    }
    
    {
        System.out.println("block parent executed");
    }
        
    static{
        System.out.println("static block parent executed");
    }
}
