package com.java.how2injava.keywords;

public class BreakKeywordSample3 {
	public static void main(String[] args) {
		outerLoop: for (int i = 1; i <= 3; i++) {
			innerLoop: for (int j = 1; j <= 3; j++) {
				if (i * j > 4) {
					break outerLoop;
					// exits the outer loop when condition is met
				}
				System.out.println(i * j);
			}
		}
	}	
}
