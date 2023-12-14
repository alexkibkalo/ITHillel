package com.ua.lesson24.command;

public class CommandMain {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);


        Ignition ignition = new Ignition();

        Command ignitionOnCommand = new IgnitionOnCommand(ignition);
        Command ignitionOffCommand = new IgnitionOffCommand(ignition);

        Car car = new Car();
        car.setCommand(ignitionOnCommand);
        car.press();

        car.setCommand(lightOnCommand);
        car.press();

        car.setCommand(ignitionOffCommand);
        car.press();

        car.setCommand(lightOffCommand);
        car.press();

    }
}
