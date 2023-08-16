package org.spring.core.loosecouplled;

public class DebitCardPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(long amount) {
        System.out.println("Process Payment from Debit card");
    }
}
