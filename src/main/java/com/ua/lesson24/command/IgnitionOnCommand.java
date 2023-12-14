package com.ua.lesson24.command;

public class IgnitionOnCommand implements Command {
    private Ignition ignition;

    public IgnitionOnCommand(Ignition ignition) {
        this.ignition = ignition;
    }

    @Override
    public void execute() {
        ignition.on();
    }
}
