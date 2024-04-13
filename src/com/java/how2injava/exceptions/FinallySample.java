package com.java.how2injava.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class FinallySample {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("output.txt");
			writer.write("Hello, World!");
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				System.err.println("Error closing file: " + e.getMessage());
			}
		}
	}
}