package com.keytech;

class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton() {
		System.out.println("Initializing a lazy singleton");
	}

	//Using synchronized for thread safety
//	public static synchronized LazySingleton getInstance() {
//
//		if (instance == null) {
//			
//			instance = new LazySingleton();
//		}
//
//		return instance;
//	}
	
	//Using double-check locking(Out dated!!)
	public static LazySingleton getInstance() {

		if (instance == null) {
			
			synchronized (LazySingleton.class) {
				
				if (instance == null) {

					instance = new LazySingleton();
				}
				
			}
		}

		return instance;
	}

}

public class Main3 {

	public static void main(String[] args) {
		/*
		 * Two problems with singleton :- 1. Lazy initialization 2. Thread safety
		 */
	}

}
