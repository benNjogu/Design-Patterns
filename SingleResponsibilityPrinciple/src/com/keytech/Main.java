package com.keytech;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	/*
	 * A class should have a single reason to change
	 * */
	public static void main(String[] args) throws IOException {

		Journal journal = new Journal();
		journal.addEntry("I cried today.");
		journal.addEntry("I always think about business.");
		
		System.out.println(journal);
		
		Persistence persistence = new Persistence();
		String filename = "/home/java.txt";
		persistence.saveToFile(journal, filename, true);
		
		Runtime.getRuntime().exec(filename);
		
	}

}
