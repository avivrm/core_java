package com.test.core.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String... args) {
		Employee e1 = new Employee(12, "xyz", 1);
		Employee e2 = new Employee(12, "xyz", 1);
		Employee e3 = new Employee(12, "xyz", 1);

		Set s = new HashSet();
		s.add(e1);
		s.add(e2);
		s.add("a");
		s.add("a");

		System.out.println(s);
		System.out.println(s.contains(e2));
		System.out.println(s.contains(e3));
	}
}

class Employee {
	private int age;
	private String name;
	private int id;

	Employee(int age, String name, int id) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}