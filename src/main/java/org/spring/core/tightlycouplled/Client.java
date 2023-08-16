package org.spring.core.tightlycouplled;

public class Client {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor();
CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();
        Order order = new Order(creditCardPaymentProcessor);
        order.processOrder();
    }
}
