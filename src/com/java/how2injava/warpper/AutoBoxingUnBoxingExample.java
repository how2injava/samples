package com.java.how2injava.warpper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// Autoboxing example
		int num = 10; // primitive int value
		Integer numObj = num; // autoboxing - converting int to Integer

		System.out.println("Primitive int value: " + num);
		System.out.println("Autoboxed Integer value: " + numObj);
		
		// Unboxing example
		Integer numObj1 = 20; // Integer object
		int num1 = numObj1; // unboxing - converting Integer to int

		System.out.println("Integer object value: " + numObj1);
		System.out.println("Unboxed int value: " + num1);

	}
}
