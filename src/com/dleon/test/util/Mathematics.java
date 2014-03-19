/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dleon.test.util;

/**
 *
 * @author Carlos
 */
public class Mathematics {

    public static long factorial(long value) throws FactException {
        
        if (value < 0 || value >= 43)
            throw new FactException("Value into [0-42] interval is required");
        
        long result = 1;
        
        while (value > 0) result *= value--;
        
        return result;
    }
    
}
