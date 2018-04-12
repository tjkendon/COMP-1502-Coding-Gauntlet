package stage5_3;

public class Driver {

	public static void main(String[] args) {

		Car c = new Car(1, 10);
		c.fill(10);
		c.drive(100);
		System.out.println(c.getFuelLevel());
		
		Car hybrid = new Car(4.6, 40);
		hybrid.fill(30);
		hybrid.drive(100);
		System.out.println(hybrid.getFuelLevel());
		
		Car truck = new Car(11.2, 60);
		truck.fill(50);
		truck.drive(100);
		System.out.println(truck.getFuelLevel());
		

	}

}
