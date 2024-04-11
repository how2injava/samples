package com.java.how2injava.keywords.superkeyword;

class Parent5 {
    Parent5() {
        System.out.println("Parent5's constructor");
    }
}

class Child5 extends Parent5 {
    Child5() {
        super(); // Calling the superclass's constructor
        System.out.println("Child5's constructor");
    }
}

public class ParentMain2 {
    public static void main(String[] args) {
        Child5 child = new Child5();
    }
}

