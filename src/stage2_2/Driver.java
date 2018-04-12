package stage2_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver {

	public static final int NUMBER_OF_BUGS = 5;
	public static final int LINE_SIZE = 80;
	
	public static void main(String[] args) {

		Random r = new Random();
		
		ArrayList<Bug> bugs = new ArrayList<Bug>();
		
		for (int i = 0; i < NUMBER_OF_BUGS; i++) {
			bugs.add(new Bug(r.nextInt(LINE_SIZE), r.nextBoolean()));
		}
		
		for (int i = 0; i < 50; i++) {
			for (Bug b: bugs) {
				if (((b.getPosition() == 0) && (b.isGoingLeft()))
						|| ((b.getPosition() == LINE_SIZE - 1) && (!b.isGoingLeft()))
						|| (r.nextBoolean())) {
					b.turn();
				} else {
					b.move();
				}
				System.out.print(b.getPosition() + " ");
 			}
			System.out.println();
			draw(bugs);
			
		}

	}
	
	public static void draw(List<Bug> bugs) {
		for (int i = 0; i < LINE_SIZE; i++) {
			for (Bug b : bugs) {
				if (b.getPosition() == i) {
					System.out.print('B');
					break;
				}
			}
			System.out.print('.');
		}
		System.out.println();
	}

}
