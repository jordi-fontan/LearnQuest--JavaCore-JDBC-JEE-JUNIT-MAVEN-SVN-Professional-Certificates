package com.lq.exercises;

public class Lab3 {

	public static void main(String[] args) {
		
		// Exercise 1
		String[] daysOfWeek = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

		for (int day = 0 ; day < daysOfWeek.length; day++) {
			System.out.println(daysOfWeek[day]);
		}
		
		for (String day: daysOfWeek) {
			System.out.println(day);
		}

		// Exercise 2
		int counter = 0;
		
		while(++counter <= 20) {
			if (counter % 2 == 1) continue; // skip odd numbers
			System.out.print(counter + " ");
		}
		System.out.println();  // complete the line so that next exercise starts on a clean line
		
		// Exercise 3
		for (int i = 1 ; i <= 100; i++) {
			if (i >= 50 && i <= 60) continue; 	// skip 50-60
			System.out.print(i + " ");
		}
		System.out.println();  // complete the line so that next exercise starts on a clean line
		
		// Exercise 4
		int month = 1;
		
		while (month <= 12) {
			switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("Month " + month + " has 31 days");
				break;
			case 2:
				System.out.println("Month " + month + " has 28 days");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("Month " + month + " has 30 days");
				break;
			default:
				System.out.println("Invalid or erroneously processed month: " + month);
			}
			
			month++;
		}
		
		// Challenge Exercise
		System.out.println("Start of output for Challenge Exercise");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		int daysInMonth = 31;
		int dayInWeek = 5;	// 0 means Sunday, 6 means Saturday
		
		String format = String.format("%%%ds", 4 * dayInWeek);	// Create format string to print the right number of blanks
		System.out.printf(format, " ");							// Print partial blank line
		for (int day = 1 ; day <= daysInMonth; day++) {			// Loop over each day
			System.out.printf("%-4d", day);						// Print day, spaced to 4 characters
			if (++dayInWeek == 7) {								// On Saturday, print newline, and reset dow
				System.out.println();
				dayInWeek = 0;
			}
		}
	}
}
