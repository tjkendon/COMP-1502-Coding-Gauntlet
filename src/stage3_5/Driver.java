package stage3_5;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		
		
		Field f = new Field();
		
		Robot r = new Patroller(3, 3, 1, true);
		
		Robot r2 = new Patroller(5, 5, -1, false);
		
		f.addRobot(r);
		f.addRobot(r2);
		
		f.drawField();
		System.out.println("--------------");

		int i = 0;
		while (i < 25) {
			r.move(f);
			r2.move(f);
		
			f.drawField();
			System.out.println("--------------");
			Thread.sleep(250);
		}
		

		
	}
	
}
