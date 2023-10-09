package com.ua.lesson4.oop1.model;


import com.ua.lesson4.oop1.service.VehicleOptions;

public class Truck extends VehicleBehavior {
    private String brand;
    private String model;

    public Truck(String brand, String model, VehicleOptions vehicleOptions) {
        this.brand = brand;
        this.model = model;
        super.vehicleOptions = vehicleOptions;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Truck: " + brand + " " + model;
    }

    @Override
    public String beep() {
        return "Say Hi from Truck!";
    }
}
