package com.keytech;

class Point {

	private double x, y;

	//Takes values x and y
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	//Takes values x and y from polar co ordinates
	public Point(double rho, double theta) {
		x = rho * Math.cos(theta);
		y = rho * Math.sin(theta);
	}

}

public class Main {

	/*
	 * Factory :- A component responsible solely for the wholesale(not piecewise)
	 * creation of objects
	 */
	public static void main(String[] args) {

	}

}
