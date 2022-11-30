package com.SyauqiAuliyaJTidurJS.controller;

import com.SyauqiAuliyaJTidurJS.Account;
import com.SyauqiAuliyaJTidurJS.Algorithm;
import com.SyauqiAuliyaJTidurJS.Renter;
import com.SyauqiAuliyaJTidurJS.dbjson.JsonAutowired;
import com.SyauqiAuliyaJTidurJS.dbjson.JsonTable;
import org.springframework.web.bind.annotation.*;

// TODO sesuaikan dengan package Anda: package com.netlabJSleepGS.controller;


// TODO sesuaikan dengan package Anda: import com.netlabJSleepGS.Account;
import org.springframework.web.bind.annotation.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/account")
public class AccountController implements BasicGetController<Account>
{

    public AccountController(){

    }
    @JsonAutowired(value = Account.class, filepath = "/Users/syauqimuhammad/Documents/KULIAH/Work/FinproIntellij/JTidur/lib/account.json")
    public static JsonTable<Account> accountTable;

    public static final String REGEX_EMAIL = "^[A-Za-z0-9]+@+[A-Za-z\\S.?]+[A-Za-z]$";
    public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";

    @Override
    public JsonTable<Account> getJsonTable (){
        return accountTable;
    }
    @RequestMapping( "/login")
    Account login (
            @RequestParam String email,
            @RequestParam String password
    ) {

        Account temp = Algorithm.<Account>find(accountTable, i -> i.email.equals(email) && i.password.equals(password));

        if (temp == null)
            return null;
        else
            return temp;
    }
    @PostMapping("/register")
    Account register
            (
                    @RequestParam String name,
                    @RequestParam String email,
                    @RequestParam String password
            )
    {
        Pattern pattern1 = Pattern.compile(REGEX_EMAIL);
        Matcher matcher1 = pattern1.matcher(email);
        boolean Matches1 = matcher1.find();

        Pattern pattern2 = Pattern.compile(REGEX_PASSWORD);
        Matcher matcher2 = pattern2.matcher(password);
        boolean Matches2 = matcher2.find();

        Account check = Algorithm.<Account>find(accountTable, i -> i.email.equals(email));


        if ((name.isBlank() == false) && Matches2 && Matches1 && (check == null)){
            Account newAccount = new Account(name, email, password);
            accountTable.add(newAccount);
            return newAccount;
        } else
            return null;

    }

    @PostMapping("/{id}/registerRenter")
    Renter registerRenter(
            @PathVariable int id,
            @RequestParam String username,
            @RequestParam String address,
            @RequestParam String phoneNumber
    ) {
        Account check = Algorithm.<Account>find(accountTable, i -> i.id == id);

        System.out.println(check);

        if (check != null){
            if (check.renter == null){
                check.renter = new Renter(username, address, phoneNumber);
                return check.renter;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }


    @PostMapping ("/{id}/topUp")
    boolean topUp (
            @PathVariable  int id,
            @PathVariable int money
    ) {
        Account acc = Algorithm.<Account>find(accountTable, i -> i.id == id);

        if (acc != null) {
            acc.balance += money;
            return true;
        } else
            return false;
    }


}