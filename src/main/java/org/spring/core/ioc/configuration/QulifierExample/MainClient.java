package org.spring.core.ioc.configuration.QulifierExample;

import org.spring.core.ioc.configuration.QulifierExample.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person.getInfo());
    }
}
