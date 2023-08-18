package org.spring.core.ioc.configuration;

import org.spring.core.ioc.configuration.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {
    public static void main(String[] args) throws Exception {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CODPaymentProcessor codPaymentProcessor = applicationContext.getBean(CODPaymentProcessor.class);
        System.out.println(codPaymentProcessor.getName());
        Order order = new Order(codPaymentProcessor);
        order.processOrder(200000);

        CreditCardPaymentProcessor creditCardPaymentProcessor = applicationContext.getBean(CreditCardPaymentProcessor.class);
        Order creditCardPaymentProcessorOrder = new Order(creditCardPaymentProcessor);
        creditCardPaymentProcessorOrder.processOrder(10000);


        DebitCardPaymentProcessor debitCardPaymentProcessor = applicationContext.getBean(DebitCardPaymentProcessor.class);
        Order debitCardPaymentProcessorOrder = new Order(debitCardPaymentProcessor);
        debitCardPaymentProcessorOrder.processOrder(8880);


    }
}
