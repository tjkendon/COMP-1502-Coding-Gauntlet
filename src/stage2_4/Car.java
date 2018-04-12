package stage2_4;

public class Car {
	
	private double fuelEffiency;
	private double fuelLevel;
	private double maxFuelLevel;
	
	public Car(double fuelEffiency, double maxFuelLevel) {
		this.fuelEffiency = fuelEffiency;
		this.maxFuelLevel = maxFuelLevel;
		this.fuelLevel = 0;
	}
	
	public void drive(double distance) {
		double fuelUse = (distance / 100) * fuelEffiency;
		fuelLevel -= fuelUse;
	}
	
	public void fill(double fuel) {
		fuelLevel = Math.min(maxFuelLevel, fuelLevel + fuel);
	}
	
	public double getFuelLevel() {
		return fuelLevel;
	}
	
	

}
