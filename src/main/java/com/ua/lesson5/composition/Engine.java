package com.ua.lesson5.composition;

public class Engine {
    private String vin;

    public Engine(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "VIN: " + vin;
    }
}
