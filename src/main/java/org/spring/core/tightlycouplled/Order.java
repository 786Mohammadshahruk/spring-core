package org.spring.core.tightlycouplled;

public class Order {

    private CreditCardPaymentProcessor paymentProcessor;

    public Order(CreditCardPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder() {
        paymentProcessor.processPayment();
    }


}
