package com.keytech;

class BasicSingleton {

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
	public static void main(String[] args) {

		BasicSingleton singleton = BasicSingleton.getInstance();
		singleton.setValue(23);
		System.out.println(singleton.getValue());
		
	}

}
