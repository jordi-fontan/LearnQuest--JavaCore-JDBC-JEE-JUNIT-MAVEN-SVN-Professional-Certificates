package com.lq.exercises;

public class ExercisePrint {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[] {
				new Rectangle(2, 4),
				new Rectangle("A Rectangle", "Red", 5, 8),
				new Square(3),
				new Square("A Square", "Orange", 5),
				new Cube(1),
				new Cube("A Cube", "Yellow", 4),
				new Box(2,4,6),
				new Box("A Box", "Green", 3,5,7),
				new Circle(16),
				new Circle("A Circle", "Blue", 16)
				};
		
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}

}
