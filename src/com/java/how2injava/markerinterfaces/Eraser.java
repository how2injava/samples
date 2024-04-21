package com.java.how2injava.markerinterfaces;

public class Eraser {
	public static void drawObject(Object object) {
		if (object instanceof Drawable) { 
			System.out.println("I am Drawable");
		} else { 
			System.out.println("I am not Drawable!");
		}
	}
	public static void main(String[] args) {
		
		Pencil pencil = new Pencil();
		drawObject(pencil); //Pencil object to drawObject method
		
		System.out.println("------------------------------");
		
		Eraser eraser = new Eraser();
		drawObject(eraser); //Eraser object to drawObject method
		
		
	}
}

/*

Output:

I am Drawable
------------------------------
I am not Drawable!

 */
