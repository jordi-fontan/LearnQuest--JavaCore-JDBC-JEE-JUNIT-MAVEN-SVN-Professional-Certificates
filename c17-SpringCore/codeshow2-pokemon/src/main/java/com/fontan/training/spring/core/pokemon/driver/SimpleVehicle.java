package driver;

public class SimpleVehicle implements Vehicle{

		int petrolTank;
		public void move()
		{
			if(petrolTank>0) {
				petrolTank--;
			}
		}
}
