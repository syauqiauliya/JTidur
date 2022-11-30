package com.SyauqiAuliyaJTidurJS;
import com.SyauqiAuliyaJTidurJS.dbjson.Serializable;

import java.util.regex.*;


/**
 * Write a description of class Renter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Renter extends Serializable
{

    public String phoneNumber;
    public String address;
    public String username;
    public static final String REGEX_PHONE = "[0-9]{9,12}";
    public static final String REGEX_NAME = "^[A-Z][A-Za-z0-9_]{4,20}";



    public boolean validate(){

        Pattern pattern1 = Pattern.compile(REGEX_PHONE);
        Matcher matcher1 = pattern1.matcher(phoneNumber);
        boolean Matches1 = matcher1.find();

        Pattern pattern2 = Pattern.compile(REGEX_NAME);
        Matcher matcher2 = pattern2.matcher(username);
        boolean Matches2 = matcher2.find();

        return Matches1 && Matches2;
    }


    public Renter (String username, String phoneNumber, String address){
        //super(id);
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.address = address;

    }


}