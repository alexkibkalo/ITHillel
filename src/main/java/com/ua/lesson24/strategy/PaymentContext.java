package com.ua.lesson24.strategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void doPayment(){
        strategy.pay();
    }
}
