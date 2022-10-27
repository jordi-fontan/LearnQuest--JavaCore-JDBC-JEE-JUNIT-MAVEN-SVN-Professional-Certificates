package com.lq.exercises;

public class CubeDriver {

	public static void main(String[] args) {
		Cube cube1 = new Cube(5);
		Cube cube2 = new Cube(8);
		
		System.out.println("Cube 1 Length is " + cube1.getLength());
		System.out.println("Cube 1 Width is " + cube1.getWidth());
		System.out.println("Cube 1 Height is " + cube1.getHeight());
		
		System.out.println("Cube 2 Length is " + cube2.getLength());
		System.out.println("Cube 2 Width is " + cube2.getWidth());
		System.out.println("Cube 2 Height is " + cube2.getHeight());
		
		cube1.setLength(20);
		cube1.printBox();

		cube1.setSide(40);
		cube1.printBox();
		
		cube2.setWidth(-5);
		cube2.printBox();
	}
}
