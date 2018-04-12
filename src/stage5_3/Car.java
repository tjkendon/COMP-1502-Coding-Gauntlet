package stage5_3;

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
		fuelLevel = Math.max(fuelLevel - fuelUse, 0);
	}
	
	public void fill(double fuel) {
		fuelLevel = Math.min(maxFuelLevel, fuelLevel + fuel);
	}
	
	public double getFuelLevel() {
		return fuelLevel;
	}
	
	

}
