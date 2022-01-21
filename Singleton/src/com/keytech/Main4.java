package com.keytech;

class InnerStaticSingleton {

	private static int age;
	
	private InnerStaticSingleton(int age) {

		this.age = age;
	}

	public static int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private static class Impl {

		private static final InnerStaticSingleton INSTANCE = 
				new InnerStaticSingleton(age);

	}
	
	public static InnerStaticSingleton getInstance() {
		
		return Impl.INSTANCE;	
	}
}

public class Main4 {

	public static void main(String[] args) {
		
		InnerStaticSingleton singleton = InnerStaticSingleton.getInstance();
		singleton.setAge(23);
		System.out.println(singleton.getAge());
	}
	
}
