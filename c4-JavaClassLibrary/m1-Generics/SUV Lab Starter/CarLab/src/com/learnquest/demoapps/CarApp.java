package com.learnquest.demoapps;

import java.time.LocalDate;

import com.learnquest.demos.transport.Car;
import com.learnquest.demos.transport.SportsCar;
import com.learnquest.demos.transport.StationWagon;

public class CarApp {
	public static void main(String[] args) {
		Car car54 = new Car();

		car54.setName("Car 54");
		car54.setSpeed(20);
		car54.setGasoline(20);
		car54.setManufactured(LocalDate.of(1961, 9,  17));
	
		Car mach5 = new SportsCar("Mach V", 250, 21, true);
		mach5.setManufactured(LocalDate.of(1967, 4, 2));

		StationWagon wagon = new StationWagon("Wagon Queen Family Truckster");
		wagon.setManufactured(LocalDate.of(1979, 7, 29));
		wagon.setCurrentCargoLoad(500);
		wagon.setSpeed(75);

		for (Car car: new Car[] { car54, mach5, wagon } ) {
			System.out.printf("%s is %d years old and is traveling at %d mph%n",
					car.getName(), car.getAge(), car.getSpeed());
		}
	}
}
