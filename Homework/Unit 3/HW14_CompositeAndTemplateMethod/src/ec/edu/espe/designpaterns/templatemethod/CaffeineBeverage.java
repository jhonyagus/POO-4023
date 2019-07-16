/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.designpaterns.templatemethod;

/**
 *
 * @author Jhony Naranjo
 */
public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(wantsCondiments()){
            addCondiments();
        }
    }
    
    public void boilWater(){
        System.out.println("Boiling water");
    }
    
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public boolean wantsCondiments(){
        return true;
    }
    
    public abstract void brew();
    public abstract void addCondiments();
}
