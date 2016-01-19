package com.core.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car extends Automobile implements Externalizable {

    String name;
    int year;

    /*
     * mandatory public no-arg constructor
     */
    public Car() { super(); }
    
    Car(String n, int y) {
	name = n;
	year = y;
    }

    /** 
     * Mandatory writeExernal method. 
     */
    public void writeExternal(ObjectOutput out) throws IOException  {
	// first we call the writeExternal of the superclass as to write
	// all the superclass data fields
	super.writeExternal(out);

	//Now the subclass fields
	out.writeObject(name);
	out.writeInt(year);
    }

    /** 
     * Mandatory readExternal method. 
     */
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	// first call the superclass external method
	super.readExternal(in);
    
	//Now the subclass fields
	name = (String) in.readObject();
	year = in.readInt();
    }

    /** 
     * Prints out the fields. used for testing!
     */
    public String toString() {
        return("Reg No: " + regNo + "\n" + "Mileage: " + mileage +
		       "Name: " + name + "\n" + "Year: " + year );
    }
}