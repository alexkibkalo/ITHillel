package com.ua.lesson22.builder;

class TaxiCar implements Builder {
    private Vehicle vehicle = new Vehicle();

    @Override
    public void number(String number) {
        vehicle.setNumber(number);
    }

    @Override
    public void model(String model) {
        vehicle.setModel(model);
    }

    @Override
    public void type(VehicleType type) {
        vehicle.setType(type);
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }
}
