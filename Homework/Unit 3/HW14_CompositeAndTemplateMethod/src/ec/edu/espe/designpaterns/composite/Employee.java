/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.designpaterns.composite;

/**
 *
 * @author Jhony Naranjo
 */
public abstract class Employee {
    protected String name = "not assigned yet";
    protected String title = "not assigned yet";
    
    public void stateName(){
        System.out.println(title+""+name);
    }
}
