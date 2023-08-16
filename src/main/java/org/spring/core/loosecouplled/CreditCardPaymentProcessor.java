package org.spring.core.loosecouplled;

import org.springframework.core.annotation.Order;

public class CreditCardPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(long amount) {
        System.out.println("Process Payment from Credit card");
    }
}
