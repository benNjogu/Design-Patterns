package com.keytech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Point {

	private int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}

class Line {

	public Point start, end;

	public Line(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
	}

}

class VectorObject extends ArrayList<Line> {

}

class VectorRectangle extends VectorObject {

	public VectorRectangle(int x, int y, int width, int height) {

		add(new Line(new Point(x, y), new Point((x + width), y)));
		add(new Line(new Point((x + width), y), new Point((x + width), (y + height))));
		add(new Line(new Point(x, y), new Point((x + width), (y + height))));
		add(new Line(new Point(x, (y + height)), new Point((x + width), (y + height))));
	}
}

class LineToPointAdapter extends ArrayList<Point>{
	
	public LineToPointAdapter(Line line) {
		/*
		 * Create an adapter that converts Lines to Points since we dont have that convertion
		 * This is then what you will use to draw the poits for the lines.
		 * 
		 * If the adapter generates temporary extra objects. To avoid this you build a cache!
		 * */
	}
}

public class Main {

	/*
	 * Adapter:- A construct which adapts an existing interface X to conform to the
	 * required interface Y.
	 */

	private static final List<VectorObject> VECTOR_OBJECTS = new ArrayList<>(
			Arrays.asList(new VectorRectangle(1, 1, 10, 10), 
					new VectorRectangle(3, 3, 6, 6)));
	
	public static void drawPoint(Point point) {
		
		System.out.println(".");
	}

	public static void main(String[] args) {

	}

}
