package com.java.how2injava.threads;

public class MultiThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is running");
        }); //Thread 1
        thread1.start();
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running");
        }); //Thread 2 
        thread2.start();
    } //Close Main
} //Class close