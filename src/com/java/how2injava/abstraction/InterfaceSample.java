package com.java.how2injava.abstraction;

interface Sound {
    void makeSound();
}

class Dog implements Sound {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceSample {
    public static void main(String[] args) {
        Sound dog = new Dog();
        dog.makeSound();
    }
}