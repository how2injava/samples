package com.java.how2injava.newinjava17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Java17Samples {
	public static void main(String[] args) {
		IShape circle = new Circle(12);
		System.out.println("Area of Circle: " + circle.calculateArea());

		IShape triangle = new Triangle(12, 12);
		System.out.println("Area of Triangle: " + triangle.calculateArea());

		IShape rectangle = new Rectangle(12, 12);
		System.out.println("Area of Rectangle: " + rectangle.calculateArea());

		//
		System.out.println(getType(12));
		
		
		//J Stream.toList() sample
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		List<Integer> evenNumbers = numbers.stream()
		                                   .filter(n -> n % 2 == 0)
		                                   .toList();
		System.out.println(evenNumbers); // Output: [2, 4]
		
		//Foreign Function Sample
		Function<Integer, Integer> square = Function.ofHandle(Platform.getPlatform().addressOfFunction("libmath", "square"));
		int result = square.apply(5);
		System.out.println(result); // Output: 25
		
		
		//Enhanced Packed Integer Support sample
		int packedValue = Integer.pack(2, 5); // Pack two integers (2 and 5) into a single packed integer
		int[] unpackedValues = Integer.unpack(packedValue, 2); // Unpack the packed integer into an array of integers
		System.out.println(Arrays.toString(unpackedValues)); // Output: [2, 5]

	}

	
	// Pattern Matching for Switch Statements

	public static String getType(Object obj) {
		return switch (obj) {
		case Integer i -> "Integer";
		case String s -> "String";
		default -> "Unknown";
		};
	}
}
