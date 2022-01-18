package com.keytech;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/*
	 * A class should have a single reason to change
	 * */
	public static void main(String[] args) {

		Journal journal = new Journal();
		journal.addEntry("I cried today.");
		journal.addEntry("I always think about business.");
		
		System.out.println(journal);
	}

}
