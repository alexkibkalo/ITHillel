package com.ua.lesson24.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirportDispatcher implements Dispatcher {
    private List<Pilot> pilots = new ArrayList<>();

    @Override
    public void addPilot(Pilot pilot){
        pilots.add(pilot);
    }

    @Override
    public void sendMessage(String message, Pilot sender) {
        for (Pilot pilot : pilots) {
            if(pilot != sender){
                pilot.receiveMessage(message);
            }
        }
    }
}
