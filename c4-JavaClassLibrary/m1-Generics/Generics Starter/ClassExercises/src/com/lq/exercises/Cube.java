package com.lq.exercises;

public class Cube extends Box {
	public Cube(double side) {
		super(side);
	}
	
	public Cube(String name, String color, double side) {
		super(name, color, side);
	}

	public void setSide(double side) {
		if (side <= 0) {
			System.out.printf("The side of a Cube (%f) must be positive number.%n", side);
			return;
		}

		// Set them all; they must be the same
		super.setLength(side);
		super.setWidth(side);
		super.setHeight(side);
	}
	
	public double getSide() {
		return getLength();
	}

	@Override
	public void setLength(double length) {
		if (getLength() != length)	// optimization to avoid calls if there is no change
			setSide(length);
	}

	@Override
	public void setWidth(double width) {
		if (getWidth() != width)	// optimization to avoid calls if there is no change
			setSide(width);
	}

	@Override
	public void setHeight(double height) {
		if (getHeight() != height)	// optimization to avoid calls if there is no change
			setSide(height);
	}
}
