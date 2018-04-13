package com.core.overriding;

public class MainOverride {
	public static void main(String... strings) {
		Child c = new Child();
		c.test();
		System.out.println(c.i);
		System.out.println(c.s);
		System.out.println(c.a);
		System.out.println(c.b);
		
		Base b = new Child();
		b.baseMethod();
		b.test();
		System.out.println(b.i);
		System.out.println(b.s);
		System.out.println(b.a);
	}
	
}
