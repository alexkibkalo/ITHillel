package com.ua.lesson23.adapter;

public class Adapter implements NewInterface {

    private OldInterface oldInterface;

    public Adapter(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public void doNewMethod() {
        oldInterface.doOldMethod();
    }
}
