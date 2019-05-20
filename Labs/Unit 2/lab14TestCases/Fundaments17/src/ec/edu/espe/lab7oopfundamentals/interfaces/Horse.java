    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals.interfaces;

import java.util.Random;

/**
 *
 * @author Jhony Naranjo
 */
public class Horse extends WildAnimal implements Pet, Animal{

    public Horse(int remainingAnimals) {
        super(remainingAnimals);
    }

    @Override
    public boolean walkThePet(int timeInSeconds, int distance) {
        Random rd = new Random();
        float speed;
        speed = distance/timeInSeconds;                
        return speed>= rd.nextFloat()*3;
    }

    
    
}