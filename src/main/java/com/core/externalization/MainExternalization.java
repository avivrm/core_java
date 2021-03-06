package com.core.externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Other questions on srialization
 * 
 * http://www.javamadesoeasy.com/2015/02/serialization-top-25-interview.html
 */

public class MainExternalization {

	public static void main(String... args) {// create a Car object 
		Car car = new Car("Mitsubishi", 2009);
		Car newCar = null;
		
		//serialize the car
		try {
		    FileOutputStream fo = new FileOutputStream("tmp");
		    ObjectOutputStream so = new ObjectOutputStream(fo);
		    so.writeObject(car);
		    so.flush();
		} catch (Exception e) {
		    System.out.println(e);
		    System.exit(1);
		}

		// de-serialize the Car
		try {
		    FileInputStream fi = new FileInputStream("tmp");
		    ObjectInputStream si = new ObjectInputStream(fi);  	    
		    newCar = (Car) si.readObject();
		}
		catch (Exception e) {
		    System.out.println(e);
		    System.exit(1);
		}

		/* 
		 * Print out the original and new car information
		 */
		System.out.println("The original car is ");
		System.out.println(car);
		System.out.println("The new car is ");
	        System.out.println(newCar);}
}
