
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

import com.fontan.training.spring.core.pockemon.driver.*;
public class DriverTest {
	@Test
	public void driverCallsMove() {
		Vehicle falseVehicle=mock(Vehicle.class);
		Driver  new Driver(falseVehicle1);
		driver.drive();
		verify(falseVehicle,times(1)).move();
	}
	
	
}
