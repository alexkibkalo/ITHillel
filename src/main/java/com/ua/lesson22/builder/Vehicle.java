package com.ua.lesson22.builder;

class Vehicle {
    private String number;
    private String model;
    private VehicleType type;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle: number=" + number + ", model=" + model + ", type=" + type;
    }
}
