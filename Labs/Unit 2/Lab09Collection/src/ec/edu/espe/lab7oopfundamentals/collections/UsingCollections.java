/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals.collections;

import ec.edu.espe.lab7oopfundamentals.inheritance.Lion;
import java.util.ArrayList;
import java.util.Collection;


/**
 *
 * @author Jhony Naranjo
 */
public class UsingCollections {
    public static void main(String[] args) {
        
        Lion lion = new Lion(true, true, 4,4,"Alex");
        
        Collection things;
        things = new ArrayList();
        System.out.println("The size of the things is -->"+things.size());
        things.add(20);
        things.add("Jhony Naranjo");
        things.add(102.84F);
        things.add(lion);
        System.out.println("The size of the things is -->"+things.size());
        System.out.println(things);
        
        Object[] thingArray = new Object[things.size()];
        thingArray = things.toArray();
        
        System.out.println("the tird element of the array is -->"+thingArray[2]);
        
        things.remove(102.84F);
        System.out.println("The size of the things is -->"+things.size());
        System.out.println(things);
               
        Collection<Lion> lions;
        lions = new ArrayList<>();
        
        for(int i = 0 ; i<5 ; i++){
            lions.add(new Lion(true,true,i+1,i+1,"Alex"+(i+1)));
        }
        System.out.println("");
        lions.forEach((p) ->{
            System.out.println("lion --> " +p);
        });
        
    }
}
