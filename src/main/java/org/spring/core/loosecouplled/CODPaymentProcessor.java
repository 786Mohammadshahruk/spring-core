package org.spring.core.loosecouplled;

public class CODPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(long amount) {
        System.out.println("Process Payment from Credit card");
    }
}
