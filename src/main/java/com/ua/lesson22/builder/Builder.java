package com.ua.lesson22.builder;

interface Builder {
    void number(String number);

    void model(String model);

    void type(VehicleType type);

    Vehicle getVehicle();
}
