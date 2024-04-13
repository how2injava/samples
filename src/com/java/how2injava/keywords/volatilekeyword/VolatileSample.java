package com.java.how2injava.keywords.volatilekeyword;

public class VolatileSample {

    private volatile boolean flag = false;

    public void setFlag() {
        flag = true;
    }

    public void doWork() {
        while (!flag) {
            // Do some work
        }
        System.out.println("Flag is set to true");
    }

    public static void main(String[] args) {
    	VolatileSample example = new VolatileSample();

        Thread thread1 = new Thread(() -> {
            example.setFlag();
        });

        Thread thread2 = new Thread(() -> {
            example.doWork();
        });

        thread1.start();
        thread2.start();
    }
}
