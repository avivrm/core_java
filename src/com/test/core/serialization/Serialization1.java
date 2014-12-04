package com.test.core.serialization;

import java.io.Serializable;

public class Serialization1 implements Serializable{

	private String name;
	private int age;
	private Integer salary;
	// either Address should  be serialize class or transient
	// else it will throw java.io.NotSerializableException
	private Address address;

	Serialization1(String name, int age, Integer salary, Address address) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString() {
		return "Serialization1 : " + name + " " + age + " " + salary + " "
				+ address;
	}

}
