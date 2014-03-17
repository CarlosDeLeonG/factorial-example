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
        return value == 1 ? 1 : value * factorial(value - 1);
    }
    
}
