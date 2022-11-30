package com.SyauqiAuliyaJTidurJS;

import com.SyauqiAuliyaJTidurJS.dbjson.Serializable;

import java.util.Date;


/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice extends Serializable
{
    public int buyerId;
    public int renterId;
    public Date time;
    public PaymentStatus status;
    public RoomRating rating;
    
    public enum RoomRating 
    {
        NONE, BAD, NEUTRAL, GOOD
    };
    
    public enum PaymentStatus 
    {
        FAILED, WAITING, SUCCESS
    };
      
        
    protected Invoice(int id, int buyerId, int renterId)
    {
        super();
        this.time = new Date();
        this.buyerId = buyerId;
        this.renterId = renterId;
        this.status = PaymentStatus.WAITING;
        this.rating = RoomRating.NONE;
    
    }
    
    public Invoice (int id, Account buyer, Renter renter){
        super();
        this.time = new Date();
        this.buyerId = buyer.id;
        this.renterId = renter.id;
        this.status = PaymentStatus.WAITING;
        this.rating = RoomRating.NONE;
        
    }

    public String print(){
        return "BuyerId: " + buyerId +"\n" + "renterId: " + renterId + "\n" + "Time: " + time;
      
    }
    

}