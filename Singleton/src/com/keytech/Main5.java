package com.keytech;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

enum EnumBasedSingleton {

	INSTANCE;
	
	EnumBasedSingleton() {
		
		value = 42;
	}

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

public class Main5 {

	/*
	 * Can't be serialized
	 * You can't inherit from it. Its an enum!!!
	 * */
	public static void main(String[] args) throws Exception {
		
		String fileName = "myFile.bin";
		
//		EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
//		singleton.setValue(111);
//		saveToFile(singleton, fileName);
		
		EnumBasedSingleton singleton2 = readFromFile(fileName);
		System.out.println(singleton2.getValue());
	}
	
	static void saveToFile(EnumBasedSingleton singleton, String fileName) throws Exception {

		try (FileOutputStream fileOut = new FileOutputStream(fileName);
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(singleton);
		}

	}

	static EnumBasedSingleton readFromFile(String fileName) throws Exception {

		try (FileInputStream fileIn = new FileInputStream(fileName);
				ObjectInputStream in = new ObjectInputStream(fileIn)) {

			return (EnumBasedSingleton) in.readObject();
		}

	}
}
