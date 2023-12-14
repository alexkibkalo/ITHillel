package com.ua.lesson24.command;

public class IgnitionOffCommand implements Command {
    private Ignition ignition;

    public IgnitionOffCommand(Ignition ignition) {
        this.ignition = ignition;
    }

    @Override
    public void execute() {
        ignition.off();
    }
}
