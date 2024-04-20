package com.java.how2injava.inheritance;

interface Animal3 {
    void eat();
}

class Mammal {
    void giveBirth() {
        System.out.println("Mammal is giving birth");
    }
}

class Dog3 extends Mammal implements Animal3 {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class HybridSample{
    public static void main(String[] args) {
    	Dog3 dog = new Dog3();
        dog.eat();
        dog.bark();
        dog.giveBirth();
    }
}
