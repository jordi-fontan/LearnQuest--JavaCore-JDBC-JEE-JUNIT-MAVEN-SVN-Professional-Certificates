package com.lq.exercises;

public class Circle extends Shape implements TwoDimensional {

	public Circle(double radius) {
		setRadius(radius);
	}
	
	public Circle(String name, String color, double radius) {
		this(radius);
		
		setName(name);
		setColor(color);
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [radius=");
		builder.append(radius);
		builder.append(", getName()=");
		builder.append(getName());
		builder.append(", getColor()=");
		builder.append(getColor());
		builder.append("]");
		return builder.toString();
	}
}
