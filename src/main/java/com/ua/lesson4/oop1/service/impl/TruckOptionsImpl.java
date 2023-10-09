package com.ua.lesson4.oop1.service.impl;


import com.ua.lesson4.oop1.service.VehicleOptions;

public class TruckOptionsImpl implements VehicleOptions {

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }

    @Override
    public void startEngine() {
        System.out.println("Truck's engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck's engine stopped");
    }
}
