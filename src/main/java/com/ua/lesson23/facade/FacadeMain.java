package com.ua.lesson23.facade;

public class FacadeMain {
    public static void main(String[] args) {
        System.out.println("-----------BAD------------");
        Wheels wheels = new Wheels();
        Engine engine = new Engine();
        Painting painting = new Painting();
        Registration registration = new Registration();
        wheels.doWheelsWork();
        engine.doEngineWork();
        painting.doPaintingWork();
        registration.doRegistrationWork();

        System.out.println("-----------GOOD----------");

        ServiceStationFacade facade = new ServiceStationFacade();
        facade.doServiceStationWork();
    }
}
