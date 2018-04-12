package stage2_2;

public class Bug {

	private int position;
	boolean goingLeft;
	
	public Bug(int position, boolean goingLeft) {
		
		this.position = position;
		this.goingLeft = goingLeft;
		
	}

	public int getPosition() {
		return position;
	}
	
	public boolean isGoingLeft() {
		return goingLeft;
	}
	
	public void move() {
		if (goingLeft) {
			position--;
		} else {
			position++;
		}
	}
	
	public void turn() {
		goingLeft = !goingLeft;
	}
	
	
	
	
	
	
}
