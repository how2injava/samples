package com.java.how2injava.keywords.superkeyword;

class Parent {
	void display() {
		System.out.println("Parent's display method");
	}
}

class Child extends Parent {
	void display() {
		super.display(); // Calling the superclass's method
		System.out.println("Child's display method");
	}
}