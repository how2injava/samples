package com.java.how2injava.warpper;

public class WrapperClassExamples {
	public static void main(String[] args) {

		Integer num = new Integer(10);
		int value = num.intValue(); // Unwrapping the Integer object to get the int value
		System.out.println(value); // Output: 10

		Double doubleNum = new Double(3.14);
		double doubleValue = doubleNum.doubleValue(); // Unwrapping the Double object to get the double value
		System.out.println(doubleValue); // Output: 3.14

		Character ch = new Character('A');
		char charValue = ch.charValue(); // Unwrapping the Character object to get the char value
		System.out.println(charValue); // Output: A

		Boolean flag = new Boolean(true);
		boolean flagValue = flag.booleanValue(); // Unwrapping the Boolean object to get the boolean value
		System.out.println(flagValue); // Output: true

		Byte b = new Byte((byte) 5);
		byte byteValue = b.byteValue(); // Unwrapping the Byte object to get the byte value
		System.out.println(byteValue); // Output: 5
		
		Short s = new Short((short) 20);
		short shortValue = s.shortValue(); // Unwrapping the Short object to get the short value
		System.out.println(shortValue); // Output: 20
	
		Long myLongVal = new Long(1000L);
		long numValue = myLongVal.longValue(); // Unwrapping the Long object to get the long value
		System.out.println(numValue); // Output: 1000
		
		Float myFloatVal = new Float(3.5f);
		float floatValue = myFloatVal.floatValue(); // Unwrapping the Float object to get the float value
		System.out.println(floatValue); // Output: 3.5
	
	}
}
