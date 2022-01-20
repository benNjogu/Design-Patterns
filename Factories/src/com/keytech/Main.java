package com.keytech;

class Point {

	private double x, y;

	private Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public static Point newCartesianPoint(double x, double y) {
		return new Point(x, y);
	}

	public static Point newPolarPoint(double rho, double theta) {
		return new Point((rho * Math.cos(theta)), (rho * Math.sin(theta)));
	}

}

public class Main {

	/*
	 * Factory :- A component responsible solely for the wholesale(not piecewise)
	 * creation of objects
	 */
	public static void main(String[] args) {
		
		Point point = Point.newPolarPoint(2, 3);
		
	}

}
