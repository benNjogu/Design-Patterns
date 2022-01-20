package com.keytech;

class Point {

	private double x, y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

}

class PointFactory {

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

		/*
		 * With the factory class and the constructor public users now have two
		 * different ways of creating the Points which is a great problem
		 */
		Point point = PointFactory.newCartesianPoint(2, 3);
		Point point2 = new Point(2, 3);

	}

}
