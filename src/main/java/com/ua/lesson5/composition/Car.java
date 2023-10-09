package com.ua.lesson5.composition;

public class Car {
    private String name;
    private Engine engine;

    public Car(String vin){
        engine = new Engine(vin);
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }
}
