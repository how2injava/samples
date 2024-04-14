package com.java.how2injava.keywords.accessmodifires;

public class AccessModifierExample {

	public int publicVar;

	private int privateVar;

	protected int protectedVar;

	int defaultVar; // default access modifier

	public void publicMethod() {
		System.out.println("This is a public method");
	}

	private void privateMethod() {
		System.out.println("This is a private method");
	}

	protected void protectedMethod() {
		System.out.println("This is a protected method");
	}


	void defaultMethod() {
		System.out.println("This is a default method");
	}

	public static void main(String[] args) {
		AccessModifierExample example = new AccessModifierExample();
		example.defaultMethod();
		example.privateMethod();
		example.publicMethod();
		example.protectedMethod();
	}
}
