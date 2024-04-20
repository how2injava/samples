package com.java.how2injava.polymorphism;

class Calculator {
    public int addition(int a, int b) {
        return a + b;
    }

    public double addition(double a, double b) {
        return a + b;
    }
}

public class CompiletimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.addition(5, 3));
        System.out.println(calc.addition(2.5, 3.7));
    }
}
