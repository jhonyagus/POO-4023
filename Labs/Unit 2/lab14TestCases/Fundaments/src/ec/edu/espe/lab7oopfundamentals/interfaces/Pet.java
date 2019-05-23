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
public interface Pet {
    /**
     * This method will calculate the velocity the pet 
     * @param timeInSeconds the time that the pet has to walk daily
     * @param distance that the pet walks in meters
     * @return true if the pet comply the distance in the time or flase if not comply
     */
    public boolean walkThePet(int timeInSeconds, int distance);
    
}