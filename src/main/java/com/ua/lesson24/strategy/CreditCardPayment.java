package com.ua.lesson24.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Payment by credit card");
    }
}
