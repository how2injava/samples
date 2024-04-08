package com.java.how2injava.keywords;

public class BooleanKeywordSample {
	public static void main(String[] args) {
		boolean isSunny = true; 
		//isWarm as false
		boolean isWarm = false;
		// Condition for isGoodWeather
		boolean isGoodWeather = isSunny && !isWarm; // false 
		if (isSunny && !isWarm) {
			System.out.println("It's sunny but not warm.");
		} else if (isSunny) {
			System.out.println("It's sunny.");
		} else {
			System.out.println("It's not sunny.");
		}
	}
}
