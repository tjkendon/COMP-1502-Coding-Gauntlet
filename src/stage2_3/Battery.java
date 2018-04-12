package stage2_3;

public class Battery {
	
	private double capacity;
	private double originalCapacity;
	private int chargeCycle = 0;
	
	public Battery(double capacity) {
		this.capacity = capacity;
		this.originalCapacity = capacity;
	}

	public double getRemainingCapacity() {
		return capacity;
	}
	
	public int getChargeCycle() {
		return chargeCycle;
	}

	public void charge() {
		this.capacity = originalCapacity;
		this.chargeCycle++;
	}
	
	public void drain(double drain) {
		this.capacity -= drain;
		if (this.capacity < 0) {
			this.capacity = 0;
		}
	}
	
	
	
	
	
	

}
