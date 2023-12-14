package com.ua.lesson24.chainofresponsibilities;

public class Handler2 extends Handler {

    @Override
    public void handleRequest(String request) {
        if(request.equals("Handler2")){
            System.out.println("Handled by Handler 2");
        } else {
            super.handleRequest(request);
        }
    }
}
