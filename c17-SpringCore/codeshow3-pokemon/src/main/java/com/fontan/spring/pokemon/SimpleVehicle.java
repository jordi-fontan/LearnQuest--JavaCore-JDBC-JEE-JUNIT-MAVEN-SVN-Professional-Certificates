package com.fontan.spring.pokemon;

public class SimpleVehicle implements Vehicle{

		int petrolTank;
		public void move()
		{
			if(petrolTank>0) {
				petrolTank--;
			}
		}
		public int getPetrolTank() {
			return petrolTank;
		}
}
