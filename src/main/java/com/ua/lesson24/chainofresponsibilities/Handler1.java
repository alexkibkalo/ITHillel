package com.ua.lesson24.chainofresponsibilities;

public class Handler1 extends Handler {

    @Override
    public void handleRequest(String request) {
        if(request.equals("Handler1")){
            System.out.println("Handled by Handler 1");
        } else {
            super.handleRequest(request);
        }
    }
}
