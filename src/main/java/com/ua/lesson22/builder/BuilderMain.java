package com.ua.lesson22.builder;


public class BuilderMain {
    public static void main(String[] args) {
        System.out.println(getVehicle(new TaxiCar(), "Audi", "1111", VehicleType.CITY));
        System.out.println(getVehicle(new SUVCar(), "Jeep", "9999", VehicleType.OFF_ROAD));
    }

    public static Vehicle getVehicle(Builder builder, String model, String number, VehicleType type) {
        builder.model(model);
        builder.number(number);
        builder.type(type);
        return builder.getVehicle();
    }


}
