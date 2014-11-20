package com.test.core.string;

public class StringBufferAndStringBuilder {

	public static void main(String[] args){
		// Constructs a string buffer with no characters in it and an initial capacity of 16 characters.
		// you can also define initial capacity
		StringBuffer sb1 = new StringBuffer();
		sb1.append("fv");
		
		// Constructs a string builder with no characters in it and an initial capacity of 16 characters.
		// you can also define initial capacity
		StringBuilder sb2 = new StringBuilder();
		sb2.append("fv");
		
		String str = "fv";
		
		String str2 = new String("fv");
		
		if(sb1.equals(sb2))
			System.out.println("equal 1");
		else
			System.out.println("not equal 1");
	}
}
