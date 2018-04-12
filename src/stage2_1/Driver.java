package stage2_1;

public class Driver {

	public static void main(String[] args) {
		
		Bug b = new Bug(10, true);
		
		System.out.println(b.getPosition());
		b.move();
		System.out.println(b.getPosition());
		b.move();
		System.out.println(b.getPosition());
		b.turn();
		System.out.println(b.getPosition());
		b.move();
		System.out.println(b.getPosition());
		b.turn();
		System.out.println(b.getPosition());
		b.move();
		System.out.println(b.getPosition());
		b.move();
		
	}
	
}
