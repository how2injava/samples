package com.java.how2injava.oops;

public class MathOperations {
    // Method to add two numbers and return the result
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    // Method for multiplication of two numbers and print the result
    public void multiplication(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("Multiplication result: " + result);
    }

    // Method to calculate the square of a number and return the result
    public int calculateSquare(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Calling the add method and storing the result
        int sum = math.addition(5, 3);
        System.out.println("Addition result: " + sum);

        // Calling the multiplication method
        math.multiplication(4, 6);

        // Calling the calculateSquare method and printing the result
        int squareResult = math.calculateSquare(7);
        System.out.println("Square result: " + squareResult);
    }
}
