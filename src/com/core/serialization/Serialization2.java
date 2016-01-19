package com.core.serialization;


public class Serialization2 extends Serialization1 {

	private String name;
	private int age;
	private Integer salary;

	Serialization2(String name, int age, Integer salary) {
		super("ewd",43,2234,null);
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Serialization2 : " + name + " " + age + " " + salary;
	}

}
