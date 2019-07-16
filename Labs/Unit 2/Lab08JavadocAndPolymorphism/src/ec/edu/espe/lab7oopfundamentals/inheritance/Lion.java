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
    
    String inf = "";
    @Override
    public String getData() {
        inf = "{\n \t \"Mane\" : \" "+mane+" \",\n \t \"Scary\" : \" "+isScary()+" \",\n \t \"Fur Thickness\" : \" "+getFurThickness()+" \",\n \t \"Number of Legs\" : \" "+getNumberOfLegs()+" \",\n \t \"Name\" : \" "+getName()+" \" \n}";
        return inf;
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
