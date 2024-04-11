package com.java.how2injava.keywords.superkeyword;

class Parent3 {
	int num = 10;
}

class Child3 extends Parent3 {
	int num = 20;

	void display() {
		System.out.println(num); // Prints the value of Child's num
		System.out.println(super.num); // Prints the value of Parent's num
	}

}
