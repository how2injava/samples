package com.java.how2injava.exceptions;



	// Example to get StringIndexOutOfBoundException
	// class
	class StringIndexOutOfBoundExceptionSample{
	 
	    // main method
	    public static void main(String[] args)
	    {
	 

	        // declaring a string
	        String s = "How2InJava";
	 
	        // accessing the second character of the given
	        // string using charAt() method
	        System.out.println(s.charAt(1));
	        System.out.println(s.charAt(5));
	        
	        // now using an index greater than the length of the
	        System.out.println(s.charAt(11));

	    }
	}