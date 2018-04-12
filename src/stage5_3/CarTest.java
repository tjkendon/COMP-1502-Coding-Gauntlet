package stage5_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {

	
	/*
	 * Test Plan
	 * 
	 * car with 10 L/100Km & 100L gas tank, empty
	 * 
	 * addFuel - correct | new car Add 10 L | tank should have 10 L in it
	 * addFuel - over Max | new car Add 110 L | tank should have 100 L in it
	 * 
	 * drive - correct | new car Add 100, drive 100 | tank should have 90 L 
	 * drive - run out of fuel | new car Add 5, drive 100Km | thak should have 0 L
	 * 
	 * 
	 * 
	 * 
	 */
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void addFuelCorrect() {
		Car c = new Car(10, 100);
		c.fill(10);
		
		
		assertEquals(10, c.getFuelLevel(), 0.1);
	}
	
	@Test
	public void addFuelOver() {
		Car c = new Car(10, 100);
		c.fill(110);
		
		
		assertEquals(100, c.getFuelLevel(), 0.1);
	}
	
	@Test
	public void driveCorrect() {
		Car c = new Car(10, 100);
		c.fill(100);
		c.drive(100);
		
		assertEquals(90, c.getFuelLevel(), 0.1);
	}
	
	@Test
	public void driveToZero() {
		Car c = new Car(10, 100);
		c.fill(5);
		c.drive(100);
		
		assertEquals(0, c.getFuelLevel(), 0.1);
	}

}
