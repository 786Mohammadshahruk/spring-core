package org.spring.core.ioc.configuration.QulifierExample.config;

import org.spring.core.ioc.configuration.QulifierExample.Address;
import org.spring.core.ioc.configuration.QulifierExample.Person;
import org.spring.core.ioc.configuration.QulifierExample.Sample;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Qualifier("mumbai")
    public Address address1() {
        Address address = new Address();
        address.setCity("Mumbai");
        return address;
    }

    @Bean
    @Qualifier("pune")
    public Address address2() {
        Address address = new Address();
        address.setCity("Pune");
        return address;
    }

    @Bean
    public Sample sample() {
        Sample sample = new Sample();
        sample.setSampleName("Test");
        return sample;
    }


    @Bean
    public Person getPerson(@Qualifier("pune") Address address, Sample sample) {
        Person person = new Person();
        person.setName("Amit");
        person.setAddress(address);
        person.setSample(sample);
        return person;
    }
}
