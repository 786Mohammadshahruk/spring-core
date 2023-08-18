package org.spring.core.ioc.configuration;


public class CreditCardPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(long amount) {
        System.out.println("Process Payment from Credit card");
    }
}
