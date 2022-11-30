package com.SyauqiAuliyaJTidurJS;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.SyauqiAuliyaJTidurJS.dbjson.JsonDBEngine;
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

    public static void main (String[] args){
        JsonDBEngine.Run(JSleep.class);
        SpringApplication.run(JSleep.class, args);
        Runtime.getRuntime().addShutdownHook(new Thread( () -> JsonDBEngine.join()));


    }

}