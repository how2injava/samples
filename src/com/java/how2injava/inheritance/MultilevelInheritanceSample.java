package com.java.how2injava.inheritance;

class Animal5 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog5 extends Animal5 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog5 {
    void play() {
        System.out.println("Labrador is playing");
    }
}

public class MultilevelInheritanceSample{
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();
        labrador.bark();
        labrador.play();
    }
}
