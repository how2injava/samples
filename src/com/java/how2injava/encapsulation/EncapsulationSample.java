package com.java.how2injava.encapsulation;

public class EncapsulationSample {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("How2inJava");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}