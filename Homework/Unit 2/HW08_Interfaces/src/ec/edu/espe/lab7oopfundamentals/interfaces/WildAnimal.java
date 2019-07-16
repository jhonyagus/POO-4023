/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals.interfaces;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author Jhony Naranjo
 */
public class WildAnimal implements Animal {
    
    int remainingAnimals;
   
    public boolean isDangerOfExtintion(){
        boolean danger;
        danger = (remainingAnimals <= 10)? true:false;
        return danger;
    }

    @Override
    public void run() {
        float speed;
        speed = rd.nextFloat() * 10;
        System.out.println("The animal is running at " + speed + "m/s");
    }

    @Override
    public void sound() {
         System.out.println("the animal is neighing");
    }

    @Override
    public void sleep(int sleepTime) {
        Calendar calendar = new GregorianCalendar();
        int second;
        int minute;
        int hour;
        second = calendar.get(Calendar.HOUR);
        minute = calendar.get(Calendar.MINUTE);
        hour = calendar.get(Calendar.SECOND);
        sleepTime = sleepTime + calculateSeconds(hour, minute, second);
        hour = sleepTime / 3600;
        minute = (sleepTime - (hour * 3600)) / 60;
        second = sleepTime - (hour * 3600) - (minute * 60);
        System.out.println("The animal wake up at: " + hour + ":" + minute + ":" + second);
    }
    
    private int calculateSeconds(int hour, int minute, int second) {
        int _second;
        second = (hour * 3600) + (minute * 60) + second;
        return second;
    }
    
    Random rd = new Random();

    public WildAnimal(int remainingAnimals) {
        this.remainingAnimals = remainingAnimals;
    }
    
    /**
     * @return the remainingAnimals
     */
    public int getRemainingAnimals() {
        return remainingAnimals;
    }

    /**
     * @param remainingAnimals the remainigAnimals to set
     */
    public void setRemainingAnimals(int remainingAnimals) {
        this.remainingAnimals = remainingAnimals;
    }

}
