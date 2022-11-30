package com.SyauqiAuliyaJTidurJS;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.google.gson.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Write a description of class JSleep here.
 *
 * @author Syauqi
 * @version (a version number or a date)
 */

@SpringBootApplication
public class JSleep {

    public JSleep(){

    }

    class Country{
        public String name;
        public int population;
        public List<String> listOfStates;
    }

    public static List<Room> filterByCity(List<Room> list, String kota, int page, int pageSize){
        return Algorithm.<Room>paginate(list, page, pageSize, i  -> i.city == City.valueOf(kota.toUpperCase()));
    }

    public static List<Room> filterByPrice(List<Room> list, double low, double high){
        return Algorithm.<Room>collect(list, i -> i.price.price >= low && i.price.price <= high);
    }

    public static List<Room> filterByAccountId(List<Room> list, int accountId, int page, int pageSize){
        return Algorithm.<Room>paginate(list, page, pageSize, i  -> i.accountId == accountId);
    }

    public static void main (String[] args){

        SpringApplication.run(JSleep.class, args);
    }

}