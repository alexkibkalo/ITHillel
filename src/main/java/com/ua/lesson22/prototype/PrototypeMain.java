package com.ua.lesson22.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Car originalCar = new Car("Audi", "9999");
        System.out.println(originalCar);
        System.out.println(originalCar.getModel() + " - " + originalCar.getNumber());


        Car duplicatedCar = (Car) originalCar.clone();
        System.out.println(duplicatedCar);
        duplicatedCar.setModel("BMW");
        System.out.println(duplicatedCar.getModel() + " - " + duplicatedCar.getNumber());

        Car twiceDuplicatedCar = (Car) originalCar.clone();
        System.out.println(twiceDuplicatedCar);
        System.out.println(duplicatedCar.getModel() + " - " + duplicatedCar.getNumber());


        System.out.println("-----------");

        System.out.println(originalCar.getModel() + " - " + originalCar.getNumber());
        System.out.println(duplicatedCar.getModel() + " - " + duplicatedCar.getNumber());
        System.out.println(twiceDuplicatedCar.getModel() + " - " + twiceDuplicatedCar.getNumber());

    }
}
