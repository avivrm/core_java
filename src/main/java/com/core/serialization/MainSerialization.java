package com.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerialization {
	/*
	 * case 1. Parent class is serialize then child class is automatically
	 * serialized case 2. If Child class is serialize and parent is not then it
	 * will throw error case 3. if any object field is used in class like
	 * Address in Serialization1 then it will not save into file/disk
	 * and in de-serialization it will become null
	 * 
	 * follow link for serialVersionUID :
	 * http://www.jusfortechies.com/java/core-java/serialVersionUID.php
	 */
	public static void main(String... strings) throws IOException,
			ClassNotFoundException {
		Address address = new Address("address1", "address2", "address3");
		Serialization1 s1 = new Serialization1("name", 1, 11, null);
		Serialization2 s2 = new Serialization2("freeqw", 12, 1000);

		FileOutputStream fout = new FileOutputStream("d:/f.txt", true);
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s2);
		out.flush();
		System.out.println("success");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"d:/f.txt"));
		Serialization2 deserialize = (Serialization2) in.readObject();
		System.out.println("Serialization: " + deserialize);
		System.out.println("deserialize complete");
	}
}
