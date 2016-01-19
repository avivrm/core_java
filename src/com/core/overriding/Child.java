package com.core.overriding;

public class Child extends Base {

	int i = 20;
	
	String s ="abc";
	
	String b="df";
	
	protected void childMethod(){
		System.out.println("In a child method");
	}
	
	public void test(){
		System.out.println("In child class");
	}
}
