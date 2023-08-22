package org.spring.core.BeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ConfigApp {

    @Bean(name = "address")
    public Address address() {
        return new Address();
    }

    @Bean(name = "student", initMethod = "init", destroyMethod = "destroy")
    public Student student() {
        return new Student(address());
    }

}