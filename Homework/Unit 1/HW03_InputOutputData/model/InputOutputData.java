/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputdata;

import java.util.Scanner;

/**
 *
 * @author Jhony Naranjo
 */
public class InputOutputData {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float number1;
        float number2;
        
        System.out.println("Digite un número: ");
        number1 = input.nextFloat();
        
        System.out.println("Digite un número: ");
        number2 = input.nextFloat();
        
        System.out.println("La suma es : "+(number1+number2));
        
    }
    
}
