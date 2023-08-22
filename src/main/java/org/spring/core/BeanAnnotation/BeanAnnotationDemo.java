package org.spring.core.BeanAnnotation;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanAnnotationDemo {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigApp.class);

        String[] beanList = applicationContext.getBeanDefinitionNames();

        for (String names : beanList) {
            System.out.println(names);
        }
        applicationContext.close();

    }
}
