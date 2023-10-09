package com.ua.lesson4.oop1.service.impl;

import com.ua.lesson4.oop1.service.VehicleOptions;

public class CarOptionsImpl implements VehicleOptions {

    @Override
    public void stop() {
        System.out.println("We are stopping");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}
