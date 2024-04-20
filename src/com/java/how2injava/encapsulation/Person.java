package com.java.how2injava.encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name; 
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }
}
