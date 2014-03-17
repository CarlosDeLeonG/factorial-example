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

    public static long factorial(long value) {
        long result = 1;
        
        while (value > 0) result *= value--;
        
        return result;
    }
    
}
