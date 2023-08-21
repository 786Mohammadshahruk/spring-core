package org.spring.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        /*Bike bike = applicationContext.getBean(Bike.class);
        bike.move();

        Car car = applicationContext.getBean(Car.class);
        car.move();

        Cycle cycle = applicationContext.getBean(Cycle.class);
        cycle.move();*/

        Traveler traveler = applicationContext.getBean(Traveler.class);
        traveler.startJourney();


    }
}
