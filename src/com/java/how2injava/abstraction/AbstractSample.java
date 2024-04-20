package com.java.how2injava.abstraction;

abstract class Shape {
	protected String color;

	public Shape(String color) {
		this.color = color;
	}

	public abstract double calculateArea();
}

class Circle extends Shape {
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

public class AbstractSample {
	public static void main(String[] args) {
		Shape circle = new Circle("Red", 5.0);
		System.out.println("Circle Area: " + circle.calculateArea());
	}
}
