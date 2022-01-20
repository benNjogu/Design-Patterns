package com.keytech;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.NEW;

class Address implements Cloneable{

	public String streetName;
	public int houseNo;

	public Address(String streetName, int houseNo) {
		super();
		this.streetName = streetName;
		this.houseNo = houseNo;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", houseNo=" + houseNo + "]";
	}

	//deep copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return new Address(streetName, houseNo);
	}
	
	

}

class Person implements Cloneable{

	public String[] names;
	public Address address;

	public Person(String[] names, Address address) {
		super();
		this.names = names;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [names=" + Arrays.toString(names) + ", address=" + address + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Person(names.clone(), (Address) address.clone());
	}
	
	

}

public class Main {

	/*
	 * A partially or fully initialized object that you copy(clone) and make use of.
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

		Person john = new Person(new String[] {"John","Wanjau"}, 
				new Address("Mwala", 7));
		
		Person jane = (Person) john.clone();
		jane.names[0] = "jane";
		jane.names[1] = "wangoi";
		jane.address.houseNo = 124;
		
		System.out.println(john);
		System.out.println(jane);
		
	}

}
