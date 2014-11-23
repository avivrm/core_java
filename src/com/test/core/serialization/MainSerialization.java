package com.test.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MainSerialization {

	public static void main(String... strings) throws IOException,
			ClassNotFoundException {
		Serialization1 s1 = new Serialization1("freeqw", "fsfdasf");

		FileOutputStream fout = new FileOutputStream("E:/f.txt", true);
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		out.flush();
		System.out.println("success");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"E:/f.txt"));
		Serialization1 s = (Serialization1) in.readObject();
		System.out.println("Serialization 1 " + s.getAddress() + " "
				+ s.getName() + " " /*+ /*s.getSerialization2()*/);
	}
}

class Serialization1 extends Serialization2 {

	private String name;
	private String address;

	// private Serialization2 serialization2;

	Serialization1(String name, String address) {
		super("freeqw", "fsfdasf");
		this.name = name;
		this.address = address;
	}

	/*public Serialization2 getSerialization2() {
		return serialization2;
	}

	public void setSerialization2(Serialization2 serialization2) {
		this.serialization2 = serialization2;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

class Serialization2 implements Serializable {

	private String name1;
	private String address1;

	Serialization2(String name, String address) {
		this.name1 = name;
		this.address1 = address;

	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String toString() {
		return "\n Serialization 2 " + name1 + " " + address1;
	}
}
