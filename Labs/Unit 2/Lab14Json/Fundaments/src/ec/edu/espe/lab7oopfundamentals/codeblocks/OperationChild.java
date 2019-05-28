/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7oopfundamentals.codeblocks;

/**
 *
 * @author Jhony Naranjo
 */
public class OperationChild extends OperationParent{
    int a;
    int b;
    static int c;
    static int d;
    
    OperationParent operationParent;
    
    public void add(){
        OperationChild op;
        //System.out.println("aja ->"+op.a); error por no estar inicializado op = null
        operationParent.getClass();
    }
    
    {
        a = 1;
        b = 2+a;
        System.out.println("block 1 es executed");
    }
    
    {
        System.out.println("block 2 es executed");
    }
    
    static {
        c = 5;
        d = 8;
        System.out.println("static block 1 executed");
    }
    
    static {
        System.out.println("static block 2 executed");
    }

    public OperationChild() {
        System.out.println("Hello OperationChild,"
                + "variables were initialized to: a ->"+ a+ " b->"+b);
        
        System.out.println("Constructor was executed");
        
        {
            
        }
    }
    
    public static void main(String[] args) {
        int a;
        OperationChild op = new OperationChild();
        {
            a = 1;
        }
        
        int entero;
        Integer integer = 2;
        integer.floatValue();
        
        double d = integer.floatValue();
        
        Double d2 = 10.5;
        System.out.println("-> "+ d2.intValue());
        String string = d2.toString();
        System.out.println("--> "+string);
        
        System.out.println(op.c);
        OperationChild  op2 = new OperationChild();
        op2.c =20;
        System.out.println(op2.c);
    }
    
      
    
}
