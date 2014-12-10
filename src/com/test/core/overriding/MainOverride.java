package com.test.core.overriding;

public class MainOverride {
	public static void main(String... strings) {
		Child c = new Child();
		c.test();
		System.out.println(c.s);
	}
}
