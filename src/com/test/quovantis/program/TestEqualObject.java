package com.test.quovantis.program;

public class TestEqualObject {

	public static void main(String... strings) {
		A a1 = new A(2, "xyz");
		A a2 = new A(2, "xyz");

		if (a1.equals(a2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}

class A {
	private int age;
	private String address;

	A(int age, String address) {
		this.age = age;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}