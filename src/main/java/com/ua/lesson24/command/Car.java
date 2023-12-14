package com.ua.lesson24.command;

public class Car {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press(){
        command.execute();
    }
}
