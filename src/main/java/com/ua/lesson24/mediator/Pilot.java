package com.ua.lesson24.mediator;

public class Pilot {
    private String transport;
    private Dispatcher dispatcher;

    public Pilot(Dispatcher dispatcher, String name) {
        this.dispatcher = dispatcher;
        this.transport = name;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void sendMessage(String message){
        System.out.println("Sending message: " + message);
        dispatcher.sendMessage(message, this);
    }

    public void receiveMessage(String message){
        System.out.println("I'm on: " + transport + "! Receiving message: " + message);
    }
}
