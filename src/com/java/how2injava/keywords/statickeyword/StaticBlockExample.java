package com.java.how2injava.keywords.statickeyword;

public class StaticBlockExample {
    static {
        System.out.println("This is a static block.");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method.");
    }
}