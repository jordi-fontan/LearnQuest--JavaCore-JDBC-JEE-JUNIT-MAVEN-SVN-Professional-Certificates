/**
 * 
 */
package com.lq.exercises;

/**
 * @author Developer
 *
 */
public class Lab2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int width, height, area;
		double radius = 10.0;
		double pi = 3.14;
		boolean result = true;

		int[] daysInMonths = new int[12];
		String[] monthNames = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		
		daysInMonths[0] = 31;		// Jan
		daysInMonths[1] = 28;		// Feb
		daysInMonths[2] = 31;		// Mar
		daysInMonths[3] = 30;		// Apr
		daysInMonths[4] = 31;		// May
		daysInMonths[5] = 30;		// Jun
		daysInMonths[6] = 31;		// Jul
		daysInMonths[7] = 31;		// Aug
		daysInMonths[8] = 30;		// Sep
		daysInMonths[9] = 31;		// Oct
		daysInMonths[10] = 30;		// Nov
		daysInMonths[11] = 31;		// Dec

		width = 8;
		height = 12;
		area = 96;

		System.out.println("Hello World");

		System.out.println("The value of width is " + width);
		System.out.println("The value of height is " + height);
		System.out.println("The value of area is " + area);
		System.out.println("The value of radius is " + radius);
		System.out.println("The value of pi is " + pi);
		System.out.println("The value of result is " + result);
		
		for (int month = 0; month < 12; month++)
			System.out.println(monthNames[month] + " has " + daysInMonths[month] + " days.");
	}

}
