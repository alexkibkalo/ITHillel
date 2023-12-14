package com.ua.lesson24.chainofresponsibilities;

public abstract class Handler {
    private Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void handleRequest(String request){
        if(handler != null){
            handler.handleRequest(request);
        }
    }
}
