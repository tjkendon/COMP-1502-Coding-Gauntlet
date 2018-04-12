package stage2_3;

public class Driver {

	public static void main(String[] args) {
		
		Battery b = new Battery(2000);
		
		System.out.println(b.getRemainingCapacity() + " - " + b.getChargeCycle());
		b.drain(500);
		System.out.println(b.getRemainingCapacity() + " - " + b.getChargeCycle());
		b.drain(1000);
		System.out.println(b.getRemainingCapacity() + " - " + b.getChargeCycle());
		b.charge();
		System.out.println(b.getRemainingCapacity() + " - " + b.getChargeCycle());
		b.drain(20000);
		System.out.println(b.getRemainingCapacity() + " - " + b.getChargeCycle());
		b.charge();
		System.out.println(b.getRemainingCapacity() + " - " + b.getChargeCycle());
		b.drain(40);
		System.out.println(b.getRemainingCapacity() + " - " + b.getChargeCycle());
		b.charge();
		System.out.println(b.getRemainingCapacity() + " - " + b.getChargeCycle());
		
		
	}
	
}
