package SyauqiAuliyaJTidurJS;

import java.util.ArrayList;
import java.util.Date;

/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room extends Serializable implements FileParser
{
    // instance variables - replace the example below with your own
    public int size;
    public String name;
    public Facility facility;
    public Price price;
    public BedType bedType;
    public City city;
    public ArrayList<Date> booked;

    public Room (int id, String name, int size, Price price, Facility facility,
    City city, String address)
    {
        super(id);
        this.name = name;
        this.size = size;
        this.price = price;
        this.facility = facility;
        this.city = city;
        this.bedType = BedType.SINGLE;
        this.booked = new ArrayList<Date>();
    }
    
     public String toString(){
        return "size: " + size + "\n" + "Name: " + name + "\n" + "Facility: " + facility + "\n" +
        "Price: " + price + "\n" + "Bed Type: " +bedType + "\n" + "City: " + city;
        
    }
    
       public Object write(){
        return null;
    }
    
    public boolean read(String x){
        return false;
    }
    
  
  
}