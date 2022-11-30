package com.SyauqiAuliyaJTidurJS;

import com.SyauqiAuliyaJTidurJS.dbjson.Serializable;

/**
 * Write a description of class Voucher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Voucher extends Serializable
{
    public Type type;
    public double cut;
    public String name;
    public int code;
    public double minimum;
    private boolean used;
    
    public Voucher(int id, String name, int code, Type type, boolean used, double minimum, double cut )
    {
        super();
        this.name = name;
        this.code = code;
        this.type = type;
        this.minimum = minimum;
        this.cut = cut;
    }
    
    public boolean isUsed(){
        return used;
    }
    
    public boolean canApply(Price price){
        if (price.price > minimum && used == false){
            return true;
        } else
            return false;
    }
    
    public double apply(Price price){
        used = true;
        
        if (type == Type.DISCOUNT){
            if (this.cut > 100){
                this.cut = 100;
            }
            return price.price - (((double)this.cut/100) * price.price);
            
            
        } else if (type == Type.REBATE) {
            if (this.cut > price.price){
                return 0;
            }
            return price.price - this.cut;
        } else {
             return 0; 
        }
    }
       public Object write(){
        return null;
    }
    
    public boolean read(String x){
        return false;
    }
    
 
}