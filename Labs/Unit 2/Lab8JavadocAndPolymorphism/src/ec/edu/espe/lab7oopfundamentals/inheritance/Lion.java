/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals.inheritance;

/**
 *
 * @author Jhony Naranjo
 */
public class Lion extends Feline{
    private boolean mane;
    
    @Override
    public String getData() {
        String data;
        data = mane+ "," +isScary()+ "," +getFurThickness()+ "," +getNumberOfLegs()+ "," +getName();
        return data;
    }

    public Lion(boolean mane, boolean scary, int furThickness, int numberOfLegs, String name) {
        super(scary, furThickness, numberOfLegs, name);
        this.mane = mane;
    }
    
    /**
     * @return the mane
     */
    public boolean isMane() {
        return mane;
    }

    /**
     * @param mane the mane to set
     */
    public void setMane(boolean mane) {
        this.mane = mane;
    }
    
}
