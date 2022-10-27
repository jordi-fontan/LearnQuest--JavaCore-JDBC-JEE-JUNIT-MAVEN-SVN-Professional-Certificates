package com.lq.exercises;

public class BoxDriver {

	public static void main(String[] args) {
		Box box1 = new Box(5, 6, 7);
		Box box2 = new Box(10);
		
		System.out.println("Box 1 Length = " + box1.getLength());
		System.out.println("Box 1 Width = " + box1.getWidth());
		System.out.println("Box 1 Height = " + box1.getHeight());

		System.out.println("Box 2 Length = " + box2.getLength());
		System.out.println("Box 2 Width = " + box2.getWidth());
		System.out.println("Box 2 Height = " + box2.getHeight());
		
		box1.setLength(3);
		box1.setWidth(4);
		box1.setHeight(5);
		
		box1.getVolume();
		box1.getSurfaceArea();
		box1.printBox();
		
		box1.setLength(-5);
		box1.setWidth(-5);
		box1.setHeight(-5);
		box1.printBox();
		
		box1 = new Box(0);
		box1.printBox();
	}
}
