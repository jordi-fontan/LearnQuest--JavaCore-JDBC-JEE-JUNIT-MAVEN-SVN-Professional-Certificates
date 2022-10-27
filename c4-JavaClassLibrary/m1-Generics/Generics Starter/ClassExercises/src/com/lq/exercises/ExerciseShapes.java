package com.lq.exercises;

public class ExerciseShapes {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[8];
		
		shapes[0] = new Rectangle(2, 4);
		shapes[1] = new Rectangle(5, 8);
		shapes[2] = new Square(3);
		shapes[3] = new Square(5);
		shapes[4] = new Cube(1);
		shapes[5] = new Cube(4);
		shapes[6] = new Box(2,4,6);
		shapes[7] = new Box(3,5,7);

		for (Shape shape: shapes) {
			// The cast will fail for non-ThreeDimentional types, so we need to check
			if (shape instanceof ThreeDimensional) {
				ThreeDimensional temp = (ThreeDimensional) shape;
				System.out.println(temp.getVolume());
			}
		}
		
		TwoDimensional[] twoDs = new TwoDimensional[3];
		
		twoDs[0] = new Circle(16);
		twoDs[1] = new Rectangle(2, 4);
		twoDs[2] = new Square(3);
		
		for (TwoDimensional twoD : twoDs) {
			System.out.printf("Area: %f, Perimeter: %f%n", twoD.getArea(), twoD.getPerimeter());
		}
	}
}
