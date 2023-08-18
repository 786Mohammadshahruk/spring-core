package org.spring.core.ioc.configuration;

public class Order {

    private PaymentProcessor paymentProcessor;

    public Order(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(long amount) throws Exception {
        if(amount<1000){
            throw  new Exception(" Please try with online payment");
        }
        paymentProcessor.processPayment(amount);
    }


}
