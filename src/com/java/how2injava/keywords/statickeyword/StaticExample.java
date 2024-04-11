package com.java.how2injava.keywords.statickeyword;

public class StaticExample {
    private static int count = 0; // Static variable

    public StaticExample() {
        count++; // Incrementing the static variable
    }

    public static void printCount() { // Static method
        System.out.println("Number of instances created: " + count);
    }

    public static void main(String[] args) {
        StaticExample instance1 = new StaticExample();
        StaticExample instance2 = new StaticExample();
        StaticExample instance3 = new StaticExample();

        StaticExample.printCount(); // Calling the static method
    }
}

