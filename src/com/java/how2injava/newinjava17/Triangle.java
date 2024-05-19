package com.java.how2injava.newinjava17;

public final class Triangle implements IShape {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
