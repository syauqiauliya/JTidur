package SyauqiAuliyaJTidurJS;


/**
 * Write a description of class Renter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Renter extends Serializable
{
    
    public int phoneNumber = 0;
    public String address = "";
    public String username;


    public Renter(int id, String username)
    {
        super(id);
        this.username = username;
        this.address = "";
        this.phoneNumber = 0;
    
    }
    
    public Renter(int id, String username, String address){
        super(id);
        this.username = username;
        this.address = address;
        this.phoneNumber = 0;
    }
    
     public Renter(int id, String username, int phoNenumber){
         super(id);
         this.username = username;
         this.phoneNumber = phoneNumber;
         this.address = "";
        
    }
    
     public Renter(int id, String username, int phoneNumber, String address){
         super(id);
         this.username = username;
         this.phoneNumber = phoneNumber;
         this.address = address;
        
    }

   
}
