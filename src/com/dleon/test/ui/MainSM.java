/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dleon.test.ui;

/**
 *
 * @author Carlos
 */
public class MainSM {

    public static final int FAULT      = -1;
    public static final int INITIAL    = 0;
    public static final int RESET      = 1;
    public static final int CALCULATED = 2;
    
    private static int current = INITIAL;
    
    public static int goNextState() {
        switch (current) {
            case INITIAL :
                return (current = RESET);
            case RESET :
                return (current = CALCULATED);
            case CALCULATED :
                return (current = RESET);
        }
        return FAULT;
    }
    
}
