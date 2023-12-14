package com.ua.lesson24.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        Dispatcher dispatcher = new AirportDispatcher();

        Pilot helicopter = new Pilot(dispatcher, "helicopter");
        Pilot bigPlane = new Pilot(dispatcher, "bigPlane");
        Pilot smallPlane = new Pilot(dispatcher, "smallPlane");

        dispatcher.addPilot(helicopter);
        helicopter.sendMessage("Hi! I'm here! Line: 1");

        dispatcher.addPilot(bigPlane);
        bigPlane.sendMessage("Hi! I'm also here! Line: 4");

        dispatcher.addPilot(smallPlane);
        smallPlane.sendMessage("Hi! I'm also here! Line: 10");
    }
}
