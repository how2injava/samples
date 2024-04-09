package com.java.how2injava.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<>();
		// Adding elements to the TreeSet

		treeSet.add("Apple");

		treeSet.add("Banana");

		treeSet.add("Orange");

		// Iterating over the elements of the TreeSet

		for (String element : treeSet) {
			System.out.println(element);
		}

		// Deleting elements from the TreeSet
		treeSet.remove("Banana");

		TreeSet<String> names = new TreeSet<>();

		names.add("John");

		names.add("Alice");

		names.add("Bob");
		// Using an iterator

		Iterator<String> iterator = names.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}
	}

}
