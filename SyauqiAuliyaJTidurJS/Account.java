package SyauqiAuliyaJTidurJS;


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Account extends Serializable implements FileParser
{
    
    public String name;
    public String email;
    public String password;
    
    public Account (int id, String name, String email, String password){
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public String toString(){
        return "name: " + name + "\n" + "email: " + email + "\n" + "password: " + password;
    }
    
    public Object write(){
        return null;
    }
    
    public boolean read(String x){
        return false;
    }

}