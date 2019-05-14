/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals.inheritance;

/**
 *
 * @author Jhony Naranjo
 * @version 0.1.0
 * @since 2019-05-08
 * @see Mammal and Feline
 */
public abstract  class  Animal {
    private int numberOfLegs;
    private String name;
    
    /**
     *  print name of the class and Animal data
     */
    public void print(){
        System.out.println(
                "Name of the class --> " +Animal.class +
                "\n" + "The animal name is --> " +name +
                " has " +numberOfLegs + " legs.");
    }
    
    /**
     * 
     * @param type is an attribute that differentiates the methods print
     */
    public void print(int type){
        System.out.println(
                "The animal name is --> " +name +
                " has " +numberOfLegs + " legs.");
    }
    
    public void print(String type){
        System.out.println(name+ "," +numberOfLegs);
    }
    
    @Override
    public String toString() {
        String data;
        data = "{\n \t \"name\": \" "+ name +" \",\n \t \"numberOfLegs\": \" "+ numberOfLegs +" \"\n}";
        return data;
    }
    
    /**
     * 
     * @return object data in format JSON
     */
    public abstract String getData();
    
    /**
     * 
     * @param numberOfLegs value that can go from 0 to 4
     * @param name given name
     */
    public Animal(int numberOfLegs, String name) {
        this.numberOfLegs = numberOfLegs;
        this.name = name;
    }
       
    public Animal(){
        this.numberOfLegs = 0;
    }

    /**
     * @return the numberOfLegs
     */
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    /**
     * @param numberOfLegs the numberOfLegs to set
     */
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
