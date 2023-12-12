package com.ua.lesson23.facade;

public class ServiceStationFacade {
    private final Wheels wheels;
    private final Engine engine;
    private final Painting painting;
    private final Registration registration;

    public ServiceStationFacade() {
        this.wheels = new Wheels();
        this.engine = new Engine();
        this.painting = new Painting();
        this.registration = new Registration();
    }

    void doServiceStationWork(){
        wheels.doWheelsWork();
        engine.doEngineWork();
        painting.doPaintingWork();
        registration.doRegistrationWork();
    }
}
