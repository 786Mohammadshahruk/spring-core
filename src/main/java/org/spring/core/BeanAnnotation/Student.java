package org.spring.core.BeanAnnotation;

class Student {

    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Student Class Method Called");
        address.print();
    }

    public void init() {
        //AWS get()
        System.out.println("Initialization Method");
    }

    public void destroy() {
        System.out.println("Destruction Method");
    }
}
