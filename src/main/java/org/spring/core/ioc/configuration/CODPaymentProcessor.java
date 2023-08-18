package org.spring.core.ioc.configuration;

public class CODPaymentProcessor implements PaymentProcessor {

    private String name;

    @Override
    public void processPayment(long amount) {
        System.out.println("Process Payment from COD");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
