package org.spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Controller
public class Traveler {

    private Vehicle vehicle;

    // Dependency Injection
    @Autowired
    public Traveler(@Qualifier("car") Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Vehicle Is initialized");
    }

    public void startJourney() {
        System.out.println("startJourney called");
        this.vehicle.move();
    }
}
