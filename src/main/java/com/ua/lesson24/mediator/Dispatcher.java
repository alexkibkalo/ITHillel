package com.ua.lesson24.mediator;

interface Dispatcher {
    void sendMessage(String message, Pilot pilot);

    void addPilot(Pilot pilot);
}
