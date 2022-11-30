package SyauqiAuliyaJTidurJS;


/**
 * Write a description of class Complaint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Complaint extends Serializable
{
    public String desc;
    public String date;
    
    // instance variables - replace the example below with your own

    public Complaint(int id, String date, String desc)
    {
        super(id);
        this.desc = desc;
        this.date = date;
        
    }
    
    public String toString(){
        return "Desc: " + desc + "\n" + "Date: " + date;
        
    }

  
}