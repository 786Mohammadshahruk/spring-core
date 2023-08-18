package org.spring.core.ioc.configuration.QulifierExample;

public class Person {

    private String name;
    private Address address;
    private Sample sample;

    public Sample getSample() {
        return sample;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "Person{" +
                "name='" + name + '\'' +
                ", City=" + address.getCity() +
                ",Sample=" + sample.getSampleName() +
                '}';
    }
}
