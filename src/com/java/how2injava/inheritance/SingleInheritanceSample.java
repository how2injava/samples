package com.java.how2injava.inheritance;

class Animal4 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog4 extends Animal4 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritanceSample {
    public static void main(String[] args) {
        Dog4 dog = new Dog4();
        dog.eat();
        dog.bark();
    }
}
