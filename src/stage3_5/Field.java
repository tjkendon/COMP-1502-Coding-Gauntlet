package stage3_5;

import java.util.ArrayList;
import java.util.List;

public class Field {
	
	protected static final int FIELD_SIZE = 10; 
	
	private List<Robot> robots;
	
	public Field() {
		robots = new ArrayList<>();
	}
	
	public void addRobot(Robot r) {
		robots.add(r);
	}
	
	public void drawField() {

		
		for (int i = 0; i < FIELD_SIZE; i++) {
			for (int j = 0; j < FIELD_SIZE; j++) {
				for (Robot r : robots) {
					if ((r.getMyY() == i) &&
							(r.getMyX() == j)) {
						System.out.print(r.getDisplay());
					} else {
						System.out.print('.');
					}
					
				}
			}
			System.out.println();
		}
	}

}
