package com.SyauqiAuliyaJTidurJS;
import com.SyauqiAuliyaJTidurJS.dbjson.Serializable;

import java.util.ArrayList;
import java.util.Date;

/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room extends Serializable
{
    // instance variables - replace the example below with your own
    public int size;
    public String name;
    public Facility facility;
    public Price price;
    public BedType bedType;
    public City city;
    public ArrayList<Date> booked;
    public String address;

    public int accountId;

    public Room (int accountId, String name, int size, Price price,  Facility facility, City city, String address){
        this.name = name;
        this.size = size;
        this.price = price;
        this.facility = facility;
        this.city = city;
        this.bedType = BedType.SINGLE;
        this.booked = new ArrayList<Date>();
        this.address = address;
        this.accountId = accountId;
    }

    public String toString(){
        return "\n" + "Room" + "\n" + "Account ID: "+ accountId + ", " + "size: " + size + ", " + "Name: " + name + ", " + "Facility: " + facility + "\n" +
                "Price: " + price + ", " + "Bed Type: " +bedType + ", " + "City: " + city;

    }

    public Object write(){
        return null;
    }

    public boolean read(String x){
        return false;
    }



}