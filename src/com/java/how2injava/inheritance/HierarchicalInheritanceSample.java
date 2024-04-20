package com.java.how2injava.inheritance;

class Animal2 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog1 extends Animal2 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal2 {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritanceSample {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        Cat cat = new Cat();
        
        dog.eat();
        dog.bark();
        
        cat.eat();
        cat.meow();
    }
}
