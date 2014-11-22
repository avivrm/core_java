package com.test.core.string;

//http://www.java-examples.com/java-string-examples

public class StringBasic {
	//Note that == compares the references not the actual contents of the String object. 
	//Where as equals method compares actual contents of two String objects.
	//compareTo throws a ClassCastException.
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello"); // Using constructor.
		char data[] = {'H', 'e', 'l','l','o'};
	    String str4 = new String(data);

		if (str1 == str2)
			System.out.println("Equal 1");
		else
			System.out.println("Not Equal 1");

		if (str1 == str3)
			System.out.println("Equal 2");
		else
			System.out
					.println("I am constructed using constructor, hence not interned");

		if (str1.equals(str3))
			System.out.println("Equal 3");
		else
			System.out.println("Not Equal 3");

		if (str1.compareTo(str2) == 0) 
			System.out.println("Equal 4");
		else
			System.out.println("not Equal 4");

		if (str1.compareTo(str4) == 0) 
			System.out.println("Equal 5");
		else
			System.out.println("not Equal 5");
	}
}
/*
 * Conversion
 * strObj.toCharArray, convert string to character array
 * new String(char[]), convert character array to String
 */


/*
 *  Link for string immutable
 *  http://javarevisited.blogspot.sg/2010/10/why-string-is-immutable-in-java.html
 * 
*/