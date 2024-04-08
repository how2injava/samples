package com.java.how2injava.exceptions;

//Example to demo ArrayIndexOutOfBoundsException
//class
class ArrayIndexOutOfBoundExceptionSample{

 // main method
 public static void main(String[] args)
 {

     // declaring and initializing an array of length 4
     int[] x = { 1, 3, 5, 4 };

     // accessing the element at 0 index
     System.out.println(x[0]);
     
     // accessing an index which is greater than the
     // length of array
     System.out.println(x[10]);

     // accessing a negative index
     System.out.println(x[-1]);
 }
}