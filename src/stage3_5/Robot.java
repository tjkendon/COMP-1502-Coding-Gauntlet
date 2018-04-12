package stage3_5;

public abstract class Robot {
	
	private int myX;
	private int myY;

	public Robot(int x, int y) {
		myX = x;
		myY = y;
	}
	
	public abstract void move(Field f);
	
	public abstract char getDisplay();

	public int getMyX() {
		return myX;
	}

	protected void setMyX(int myX) {
		this.myX = myX;
	}

	public int getMyY() {
		return myY;
	}

	protected void setMyY(int myY) {
		this.myY = myY;
	}

	
	
}
