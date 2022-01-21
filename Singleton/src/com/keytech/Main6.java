package com.keytech;

class ChiefExecutiveOfficer {

	private static String name;
	private static int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		ChiefExecutiveOfficer.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		ChiefExecutiveOfficer.age = age;
	}

	@Override
	public String toString() {
		return "ChiefExecutiveOfficer [getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	

}

public class Main6 {

	public static void main(String[] args) {
		
		ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
		ceo.setName("Bernad Njogu.");
		ceo.setAge(28);
		
		ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();
		
		System.out.println(ceo2);
	}
	
}
