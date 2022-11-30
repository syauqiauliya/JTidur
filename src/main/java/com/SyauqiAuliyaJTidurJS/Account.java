package com.SyauqiAuliyaJTidurJS;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Account extends Serializable
{

    public String name;
    public String email;
    public String password;
    public static final String REGEX_EMAIL = "^[A-Za-z0-9]+@+[A-Za-z\\S.?]+[A-Za-z]$";

    public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";

    /*
     public static final String REGEX_EMAIL = "[A-Za-z0-9\S]+@+[A-Za-z\S.?]+[\w]$";
    public static final String REGEX_PASSWORD = "(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{8,}$";
     */

    public Account (String name, String email, String password){
        //super(id);
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String toString(){
        return "name: " + name + "\n" + "email: " + email + "\n" + "password: " + password;
    }

    public boolean validate(){

        Pattern pattern1 = Pattern.compile(REGEX_EMAIL);
        Matcher matcher1 = pattern1.matcher(email);
        boolean Matches1 = matcher1.find();

        Pattern pattern2 = Pattern.compile(REGEX_PASSWORD);
        Matcher matcher2 = pattern2.matcher(password);
        boolean Matches2 = matcher2.find();

        return Matches1 && Matches2;
    }

    /*public Object write(){
        return null;
    }*/

    /*public boolean read(String x){
        return false;
    }*/

}