package com.ua.lesson7.solid;

public class DependencyInversion {
    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        Switchable display = new Display();

        LightSwitch switchLightBulb = new LightSwitch(lightBulb);
        LightSwitch switchDisplay = new LightSwitch(display);

        switchLightBulb.turnOn();
        switchLightBulb.turnOff();
        switchDisplay.turnOn();
        switchDisplay.turnOff();
    }
}

// Abstraction
interface Switchable {
    void turnOn();

    void turnOff();
}

// Low-level class
class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light bulb is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb is off");
    }
}

// Low-level class
class Display implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Display is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Display is off");
    }
}

// High-level class
class LightSwitch {
    private Switchable device;

    public LightSwitch(Switchable device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}

// Тепер ви можете використовувати клас LightSwitch без тісного зв’язку з класом LightBulb.
// Ви можете легко переключитися на інший пристрій, забезпечивши іншу реалізацію інтерфейсу Switchable.
