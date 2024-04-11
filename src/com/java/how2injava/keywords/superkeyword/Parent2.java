package com.java.how2injava.keywords.superkeyword;

class Parent2 {

	Parent2(int x) { // Constructor logic
	}

}

class Child2 extends Parent2 {

	Child2(int x, int y) { // Calling the superclass's constructor
		super(x); // Constructor logic for Child class

	}

}