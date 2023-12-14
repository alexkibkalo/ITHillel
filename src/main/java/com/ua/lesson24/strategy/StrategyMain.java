package com.ua.lesson24.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        PaymentStrategy strategy = getStrategyByPaymentType("cash");
        PaymentContext context = new PaymentContext(strategy);
        context.doPayment();
    }

    private static PaymentStrategy getStrategyByPaymentType(String paymentType) {
        switch (paymentType) {
            case "cash" -> {
                return new CashPayment();
            }
            case "card" -> {
                return new CreditCardPayment();
            }
            default -> throw new RuntimeException();
        }
    }
}
