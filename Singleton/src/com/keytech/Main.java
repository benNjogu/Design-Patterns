package com.keytech;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class BasicSingleton implements Serializable{

	private BasicSingleton() {

	}

	private static final BasicSingleton INSTANCE = new BasicSingleton();

	public static BasicSingleton getInstance() {
		return INSTANCE;
	}

	private int value = 0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

public class Main {

	/*
	 * Singleton :- a component which is instantiated only once
	 */
	public static void main(String[] args) throws Exception {

		BasicSingleton singleton = BasicSingleton.getInstance();
		singleton.setValue(111);
		
		String fileName = "singleton.bin";
		saveToFile(singleton, fileName);
		
		singleton.setValue(222);
		
		BasicSingleton singleton2 = readFromFile(fileName);
		
		System.out.println(singleton2 == singleton);
		System.out.println(singleton.getValue());
		System.out.println(singleton2.getValue());

	}

	static void saveToFile(BasicSingleton singleton, String fileName) throws Exception {

		try (FileOutputStream fileOut = new FileOutputStream(fileName);
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(singleton);
		}

	}

	static BasicSingleton readFromFile(String fileName) throws Exception {

		try (FileInputStream fileIn = new FileInputStream(fileName);
				ObjectInputStream in = new ObjectInputStream(fileIn)) {

			return (BasicSingleton) in.readObject();
		}

	}

}
