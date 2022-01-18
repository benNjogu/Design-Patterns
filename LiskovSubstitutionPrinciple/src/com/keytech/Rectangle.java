package com.keytech;

public class Rectangle {

	protected int width, height;

	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
	/*one way to solve this is to check whether the shape is a square 
	 * and then do away with the square class.
	 * Alternatively you can use factory pattern. 
	*/
	public boolean isSquare() {
		return width == height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
