package com.lq.exercises;

public class Square extends Rectangle {
	public Square(double side) {
		super(side, side);
	}

	public Square(String name, String color, double side) {
		super(name, color, side, side);
	}
}
