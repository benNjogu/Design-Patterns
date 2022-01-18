package com.keytech;

public class Main {

	/*
	 * Liskov Substitution principle 
	 * You should be able to substitute a subclass for a base class
	 */
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(2,3);
		rectangle(rectangle);
//		Expected area of :20; got :20
		
		Square square = new Square();
		square.setWidth(5);
		rectangle(square);
//		Expected area of :50; got :100
		
		RectangleFactory rectangle2 = new RectangleFactory();
		System.out.println(rectangle2.newRectangle(2, 3).getArea());
		System.out.println(rectangle2.newSquare(5).getArea());
	}

	public static void rectangle(Rectangle rectangle) {
		int width = rectangle.getWidth();
		rectangle.setHeight(10);
		// Area = width * 10;
		System.out.println("Expected area of :" + (width * 10) +"; got :" + rectangle.getArea());
	}

}
