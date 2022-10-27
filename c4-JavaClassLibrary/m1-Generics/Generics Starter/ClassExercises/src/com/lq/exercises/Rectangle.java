package com.lq.exercises;

public class Rectangle extends Shape implements TwoDimensional {
	private double length, width;

	public Rectangle(double length, double width) {
		this("Unknown", "White", length, width);
	}

	public Rectangle(String name, String color, double length, double width) {
		setName(name);
		setColor(color);
		
		setLength(length);
		setWidth(width);
	}
	
	@Override
	public double getArea() {
		return getLength() * getWidth();
	}

	@Override
	public double getPerimeter() {
		return (getLength() + getWidth()) * 2;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle [length=");
		builder.append(length);
		builder.append(", width=");
		builder.append(width);
		builder.append(", getName()=");
		builder.append(getName());
		builder.append(", getColor()=");
		builder.append(getColor());
		builder.append("]");
		return builder.toString();
	}
}
