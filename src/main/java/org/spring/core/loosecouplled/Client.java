package org.spring.core.loosecouplled;

public class Client {
    public static void main(String[] args) throws Exception {

        CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentProcessor();
        Order order = new Order(creditCardPaymentProcessor);
        order.processOrder(1000);

        DebitCardPaymentProcessor debitCardPaymentProcessor = new DebitCardPaymentProcessor();
        Order order1 = new Order(debitCardPaymentProcessor);
        order1.processOrder(50000);

        UpiPaymentProcessor upiPaymentProcessor =new UpiPaymentProcessor();
        Order order2 = new Order(upiPaymentProcessor);
        order2.processOrder(10000);

        CODPaymentProcessor codPaymentProcessor = new CODPaymentProcessor();
        Order order3 = new Order(codPaymentProcessor);
        order3.processOrder(500);

    }
}
