package com.keytech;

//solution for the constructors
enum CoordinateSystem {
	CARTESIAN, POLAR
}

class Point {

	private double x, y;

	/*
	 * @param a is x if cartesian and rho if polar 
	 * @param b
	 * */
	public Point(double a, double b, CoordinateSystem cs) {
		super();
		switch (cs) {
		case CARTESIAN:
			this.x = a;
			this.y = b;
			break;

		case POLAR:
			x = a * Math.cos(b);
			y = a * Math.sin(b);
			break;
		}

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
