package com.java.how2injava.keywords.transientkeyword;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private transient String password;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", "secretpassword");

        // Code to serialize the Person object to a file

        // Code to deserialize the Person object from the file

        System.out.println("Name: " + person.getName());
        System.out.println("Password: " + person.getPassword());
    }
}

