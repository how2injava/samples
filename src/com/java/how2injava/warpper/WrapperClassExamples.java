package com.java.how2injava.warpper;

public class WrapperClassExamples {
	public static void main(String[] args) {

		Integer num = new Integer(10);
		int value = num.intValue(); // Unwrapping the Integer object to get the int value
		System.out.println(value); // Output: 10

		Double num = new Double(3.14);
		double value = num.doubleValue(); // Unwrapping the Double object to get the double value
		System.out.println(value); // Output: 3.14

		Character ch = new Character('A');
		char value = ch.charValue(); // Unwrapping the Character object to get the char value
		System.out.println(value); // Output: A

		Boolean flag = new Boolean(true);
		boolean value = flag.booleanValue(); // Unwrapping the Boolean object to get the boolean value
		System.out.println(value); // Output: true

		Byte b = new Byte((byte) 5);
		byte value = b.byteValue(); // Unwrapping the Byte object to get the byte value
		System.out.println(value); // Output: 5
		
		Short s = new Short((short) 20);
		short value = s.shortValue(); // Unwrapping the Short object to get the short value
		System.out.println(value); // Output: 20
	
		Long num = new Long(1000L);
		long value = num.longValue(); // Unwrapping the Long object to get the long value
		System.out.println(value); // Output: 1000
		
		Float num = new Float(3.5f);
		float value = num.floatValue(); // Unwrapping the Float object to get the float value
		System.out.println(value); // Output: 3.5
	
	}
}
