
package PrimitiveVariables;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PerimeterAreaQuadrilaterals {
    public static void main(String[] args){
        Quadrilateral c1;
        float side1;
        float side2;
        char option;
        boolean squareOrNot;
        do{
            side1 = Float.parseFloat(JOptionPane.showInputDialog("Type side 1: "));
            side2 = Float.parseFloat(JOptionPane.showInputDialog("Type side 2: "));
     
        if(side1 == side2){
            squareOrNot=true;
        }
        else{
            squareOrNot=false;
        }
        
        if(squareOrNot){
            c1 = new Quadrilateral(side1);
        }else{
            c1 = new Quadrilateral(side1, side2);
        }
        
        System.out.println("Perimeter is: "+c1.getPerimeter());
        System.out.println("Area is: "+c1.getArea());
        
        Scanner readOption = new Scanner(System.in);
        System.out.println("1. Continue\n2.Off");
      
        option = readOption.next().charAt(0);
        }while(option == '1');
    }
}
