package com.ua.lesson24.chainofresponsibilities;

public class ChainOfResponsibilitiesMain {
    public static void main(String[] args) {
        Handler handler1 = new Handler1();
        Handler handler2 = new Handler2();

        handler1.setHandler(handler2);

        handler1.handleRequest("Handler1");
        handler1.handleRequest("Handler2");
        handler1.handleRequest("Handler3");
    }
}
