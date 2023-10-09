package com.ua.lesson4.oop1.service;

public interface VehicleOptions {

    default void drive(){
        System.out.println("We are driving");
    }

    void stop();

    void startEngine();

    void stopEngine();
}
