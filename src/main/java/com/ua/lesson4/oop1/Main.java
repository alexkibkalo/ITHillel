package com.ua.lesson4.oop1;

import com.ua.lesson4.oop1.model.Car;
import com.ua.lesson4.oop1.model.Truck;
import com.ua.lesson4.oop1.model.VehicleBehavior;
import com.ua.lesson4.oop1.service.impl.CarOptionsImpl;
import com.ua.lesson4.oop1.service.impl.TruckOptionsImpl;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", "A3", 20000, new CarOptionsImpl());
        run(car);
        System.out.println(car.beep());

        System.out.println("------------------------");

        Truck truck = new Truck("Volvo", "X44", new TruckOptionsImpl());
        run(truck);
        System.out.println(truck.beep());
    }

    public static void run(VehicleBehavior vehicleBehavior){
        System.out.println(vehicleBehavior);
        vehicleBehavior.getVehicleOptions().startEngine();
        vehicleBehavior.getVehicleOptions().drive();
        vehicleBehavior.getVehicleOptions().stop();
        vehicleBehavior.getVehicleOptions().stopEngine();
    }
}
