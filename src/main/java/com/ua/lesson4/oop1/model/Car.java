package com.ua.lesson4.oop1.model;


import com.ua.lesson4.oop1.service.VehicleOptions;

public class Car extends VehicleBehavior {
    private String brand;
    private String model;
    private int price;
    public static int engine;

    static {
        engine = 2;
    }

    public Car(String brand, String model, Integer price, VehicleOptions vehicleOptions){
        validatePrice(price);
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.vehicleOptions = vehicleOptions;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        validatePrice(price);
        this.price = price;
    }



    void validatePrice(int price){
        if(price <= 0){
            throw new RuntimeException("Price should be more than 0");
        }
    }

    @Override
    public String toString() {
        return "Car: " + brand + " " + model + ", " + price;
    }

    @Override
    public String beep() {
        return "Say Hi from Car!";
    }
}
