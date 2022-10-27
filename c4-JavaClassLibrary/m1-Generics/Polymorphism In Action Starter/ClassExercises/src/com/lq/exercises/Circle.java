package com.lq.exercises;

public class Circle extends Shape implements TwoDimensional {

	public Circle(double radius) {
		setRadius(radius);
	}
	
	private void setRadius(double radius) {
		this.radius = radius;
	}
	
	private double getRadius() {
		return radius;
	}

	private double radius;
	
	@Override
	public double getArea() {
		return Math.PI * getRadius() * getRadius();
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * getRadius();
	}
}
