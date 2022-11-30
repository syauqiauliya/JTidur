package com.SyauqiAuliyaJTidurJS;

public class ThreadingObject extends Thread {

    public ThreadingObject(String name){
        super(name);
        this.start();
    }

    @Override
    public void run(){
        System.out.println("" + Thread.currentThread().getName() + " is running");
        System.out.println("" + Thread.currentThread().getId() + " is running");
    }
}