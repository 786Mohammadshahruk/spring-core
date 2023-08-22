package org.spring.core.setterBasedDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage("HI Good Morning Have a nice Day !!!!");
    }
}
