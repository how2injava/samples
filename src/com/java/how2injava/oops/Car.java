package com.java.how2injava.oops;

public class Car {
    private String model;
    private String make;
    private int year;

    public Car( String make, String model, int makeYear) {
        this.make = make;
        this.model = model;
        this.year = makeYear;
    }

    public void displayInfo() {
        System.out.println("Car model: " + model);
        System.out.println("Car make: " + make);      
        System.out.println("Car year: " + year);
    }

    public static void main(String[] args) {
        //create an object of the Car class
        Car myCar = new Car("Camry", "Toyota", 2020);

        // Use the object to call a method
        myCar.displayInfo();
    }
}

