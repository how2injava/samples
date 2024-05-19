package com.java.how2injava.newinjava21;

public class Java21Sample {
	
	public record Person(String name, int age) {}
	
	public static void main(String[] args) {
		Object obj = "Hello";
		if (obj instanceof String s) {
		    System.out.println(s.length());
		}

		Person person = new Person("how2inJava", 21);
		System.out.println(person.age() +" -"+ person.name());
	
		String html = """
			    <html>
			        <body>
			            <p>Hello, World!</p>
			        </body>
			    </html>
			""";
	}
}


