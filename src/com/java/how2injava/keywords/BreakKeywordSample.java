package com.java.how2injava.keywords;

public class BreakKeywordSample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
		    if (i == 5) {
		        break; // terminates the loop when i equals 5
		    }
		    System.out.println(i);
		}
	}	
}
