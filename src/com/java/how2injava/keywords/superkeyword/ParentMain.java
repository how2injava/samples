package com.java.how2injava.keywords.superkeyword;

class Parent4 {
	void display() {
		System.out.println("Parent's display method");
	}

}

class Child4 extends Parent4 {
	void display() {
		super.display(); // Using super to call the method from Parent class
	}

}

public class ParentMain {
	public static void main(String[] args) {
		Parent4 obj = new Child4();
		obj.display(); // Calls the display method of Child class
	}
}
