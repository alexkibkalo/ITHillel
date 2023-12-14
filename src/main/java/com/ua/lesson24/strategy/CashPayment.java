package com.ua.lesson24.strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Payment by cash");
    }
}
