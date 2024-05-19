package com.java.how2injava.newinjava11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Java11Sample {
	public static void main(String[] args) {

		// Local variable type inference:
		// Before Java 11

		List<String> list = new ArrayList<String>();

		// With Java 11 var keyword

		var list1 = new ArrayList<String>();

		// HTTP Client API: Sample
		// Sending a GET request using the new HTTP Client API

		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder()

				.uri(URI.create("https://api.example.com/data"))

				.build();

		HttpResponse<String> response = null;
		try {
			response = client.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(response.body());

		// Print a Unicode character

		System.out.println("\u2764"); // Prints a heart symbol ❤

		// Check if running on AArch64 architecture

		if (System.getProperty("os.arch").equals("aarch64")) {

			System.out.println("Running on AArch64 architecture");

		}
	}

}
