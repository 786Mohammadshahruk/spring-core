package org.spring.core.iocExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
    public static void main(String[] args) throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CODPaymentProcessor codPaymentProcessor = applicationContext.getBean("codPaymentProcessor", CODPaymentProcessor.class);
        System.out.println(codPaymentProcessor.getName());
        Order order = new Order(codPaymentProcessor);
        order.processOrder(200000);

    }
}
