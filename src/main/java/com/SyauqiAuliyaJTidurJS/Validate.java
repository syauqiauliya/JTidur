package com.SyauqiAuliyaJTidurJS;

import java.util.*;


/**
 * Write a description of class Validate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Validate
{
    
    public Validate()
    {
       
    }
    
    public static ArrayList filter(Price[] list, int value, boolean less){
        
        ArrayList ALPrice = new ArrayList();
        
        for (int i = 0; i < list.length; i++){
            if (less == true){
                if (list[i].price <= value){
                    ALPrice.add(list[i].price);
                }
                
            } else if (less == false){
                if (list[i].price > value){
                     ALPrice.add(list[i].price);
                }
            }            
        }
           return ALPrice;
    }

}