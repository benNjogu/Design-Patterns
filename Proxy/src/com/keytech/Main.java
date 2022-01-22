package com.keytech;

interface Drivable {

	void drive();
}

class Car implements Drivable {

	protected Driver driver;

	public Car(Driver driver) {
		super();
		this.driver = driver;
	}

	@Override
	public void drive() {

		System.out.println("Car being driven");
	}

}

class Driver {

	public int age;

	public Driver(int age) {
		super();
		this.age = age;
	}

}

class CarProxy extends Car {

	public CarProxy(Driver driver) {
		super(driver);

	}

	@Override
	public void drive() {

		if (driver.age >= 16)
			super.drive();
		else
			System.out.println("Driver too young");

	}

}

public class Main {

	/*
	 * Proxy:- An interface for accessing a particular resource
	 */
	public static void main(String[] args) {

		Car car = new CarProxy(new Driver(12));
		car.drive();
		
	}
}
