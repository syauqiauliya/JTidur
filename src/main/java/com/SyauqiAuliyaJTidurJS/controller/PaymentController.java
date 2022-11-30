package com.SyauqiAuliyaJTidurJS.controller;

import com.SyauqiAuliyaJTidurJS.Payment;
import com.SyauqiAuliyaJTidurJS.dbjson.JsonAutowired;
import com.SyauqiAuliyaJTidurJS.dbjson.JsonTable;
import com.SyauqiAuliyaJTidurJS.dbjson.Serializable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")

public class PaymentController extends Serializable<Payment> {

    @JsonAutowired(value = Payment.class, filepath = "/Users/syauqimuhammad/Documents/KULIAH/Work/FinproIntellij/JTidur/lib/payment.json")
    public static JsonTable<Payment> paymentTable;

    public JsonTable<Payment> getJsonTable (){
        return paymentTable;
    }

    @PostMapping("/accept")
    public boolean accept (@RequestParam int id){
        return false;
    }

    @PostMapping("/cancel")
    public boolean cancel (@RequestParam int id){
        return false;
    }

    @PostMapping("/submit")
    public boolean submit (@RequestParam int id){
        return false;
    }

    @PostMapping("/create")
    public Payment create(
            @RequestParam int buyerId,
            @RequestParam int renterId,
            @RequestParam int roomId,
            @RequestParam String from,
            @RequestParam String to
    ) {
        return null;
    }




}