package com.keytech;

interface Render {

	void renderCircle(float radius);
}

class VectorRenderer implements Render {

	@Override
	public void renderCircle(float radius) {

		System.out.println("Drawing a circle of radius " + radius);
	}

}

class RasterRenderer implements Render {

	@Override
	public void renderCircle(float radius) {

		System.out.println("Drawing pixels for a circle" + " of radius " + radius);
	}

}

abstract class Shape {

	protected Render render;

	public Shape(Render render) {
		super();
		this.render = render;
	}

	public abstract void draw();

	public abstract void resize(float factor);
}

class Circle extends Shape {

	private float radius;
	
	public Circle(Render render) {
		super(render);
	}
	
	public Circle(Render render, float radius) {
		super(render);
		this.radius = radius;
	}

	@Override
	public void draw() {

		render.renderCircle(radius);
	}

	@Override
	public void resize(float factor) {

		radius *= factor;
	}

}

public class Main {

	/*
	 * Bridge:- An interface that decouples an interface(hierarchy) from an
	 * implementation (hierarchy)
	 */
	public static void main(String[] args) {

		/*
		 * Use google guice to inject the dependencies
		 * */
		
	}

}
