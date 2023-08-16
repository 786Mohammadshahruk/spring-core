package org.spring.core.loosecouplled;

public class UpiPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(long amount) {
        System.out.println("Process Payment from UPI");
    }
}
