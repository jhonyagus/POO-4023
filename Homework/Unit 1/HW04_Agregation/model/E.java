/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab6agregation.model;

/**
 *
 * @author Jhony Naranjo
 */
public class E {
    private A[] as = new A[15];

    public E() {
        for(int j=0; j<15;j++){
            as[j] = new A(j);
        }
    }
    
    public void m(){
        for(int i=0; i<15;i++){
            System.out.println((i+1)+" : "+as[i].m());
        }
    }
}
