package edu.fontan.generics.carsApps;

import java.util.Collection;

import edu.fontan.cars.*;

public class VehicleApp {

	public VehicleApp() {
		// TODO Auto-generated constructor stub
	}

	// Method race, makes race all sports cars
	public static void race(Object[] raceCars)
	{
		for(Object obj:raceCars) {
			if(obj instanceof SportsCar) {
				
				SportsCar sc= (SportsCar) obj;
				sc.race();
			}
		}

	}
	
	// Method race, makes race all sports cars
		public static void race(Collection<SportsCar> csr)
		{
			//Not downcasting nor typecheck needed
			for(SportsCar sc:csr) {
					sc.race();
			}

		}
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
	}

}
