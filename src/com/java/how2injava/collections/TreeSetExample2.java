package com.java.how2injava.collections;

import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {

		TreeSet<Integer> numbers = new TreeSet<>();
		// Adding elements to the TreeSet
		numbers.add(5);

		numbers.add(2);

		numbers.add(8);

		numbers.add(1);

		System.out.println(numbers); // Output: [1, 2, 5, 8]
		
		
		TreeSet<String> colors= new TreeSet<>();

		colors.add("Red");

		colors.add("Blue");

		colors.add("Green");

		colors.remove("Blue");

		System.out.println(colors);// Output: [Green, Red]
	}

}
