/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 *
 * @author ENVY
 */
public class MyComparator implements Comparator<String> {

    @Override
    public int compare(String t, String t1) {
        
        //лексикографический порядок наоборот.
        if(t.compareTo(t1) > 1)
            return -1;
        else if(t.compareTo(t1) < 1)
            return 1;
        else 
            return 0;
    }
    
}
