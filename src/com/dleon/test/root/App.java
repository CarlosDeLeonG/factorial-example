/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dleon.test.root;

import com.dleon.test.util.Mathematics;

/**
 *
 * @author Carlos
 */
public class App {

    public static void main(String[] args) {
        
        long value = 0;
        
        if (args.length < 1) return;
        
        try {
            value = Long.parseLong(args[0]);
            System.out.println("Factorial of " + value + ": " + Mathematics.factorial(value));
        } catch(Exception e) {
            System.err.println("Error: " + e.getStackTrace());
            return;
        }
        
    }
}
