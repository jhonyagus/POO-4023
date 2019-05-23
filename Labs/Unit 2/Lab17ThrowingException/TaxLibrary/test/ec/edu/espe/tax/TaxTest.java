/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhony Naranjo
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva() {
        float base = 0;
        float expectedIva = 0;
        float actualIva = Tax.computeIva(base);
        
       // assertArrayEquals(expectedIva, actualIva, 4);
        assertEquals(expectedIva, actualIva, 4);
    }
    
     @Test
    public void testComputeIvaFloatNumber() {
        float base = 3.2F;
        double expectedIva = 0.384F;
        float actualIva = Tax.computeIva(base);
        
        assertEquals(expectedIva, actualIva, 4);
    }
     @Test
    public void testComputeIvaInteger() {
        float base = 3580;
        float expectedIva = 4296;
        float actualIva = Tax.computeIva(base);
        
        assertEquals(expectedIva, actualIva, 4);
    }
     @Test
    public void testComputeIvaNegativeNumber() {
        float base = -1;
        float expectedIva = -1;
        float actualIva = Tax.computeIva(base);
        
        assertEquals(expectedIva, actualIva, 4);
    }
     @Test
    public void testComputeIvaChar() {
        float base = 'a';
        float expectedIva = -1;
        float actualIva = Tax.computeIva(base);
        
        assertEquals(expectedIva, actualIva, 4);
    }
   
    
}
