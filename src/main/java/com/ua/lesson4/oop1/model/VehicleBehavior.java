package com.ua.lesson4.oop1.model;

import com.ua.lesson4.oop1.service.VehicleOptions;

public abstract class VehicleBehavior {

    protected VehicleOptions vehicleOptions;

    public VehicleOptions getVehicleOptions() {
        return vehicleOptions;
    }

    protected abstract String beep();
}
