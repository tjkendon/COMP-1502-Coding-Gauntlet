package stage3_5;

public class Patroller extends Robot{

	private int move = 1;
	private boolean upDown = false;
	
	public Patroller(int x,
			int y) {
		super(x,y);
	}
	
	public Patroller(int x, 
			int y, 
			int move, 
			boolean upDown) {
		super(x,y);
		this.move = move;
		this.upDown = upDown;
	}
	
	
	@Override
	public char getDisplay() {
		return 'P';
	}

	@Override
	public void move(Field f) {
		if (onTheEdge(f)) {
			move = -move;
		}
		if (upDown) {
			setMyY(getMyY() + move);
		} else {
			setMyX(getMyX() + move);
		}
		
		
	}
	
	public boolean onTheEdge(Field f) {
		if (upDown) {
			if ((getMyY() == 0) || 
					getMyY() == f.FIELD_SIZE -1) {
				return true;
			}
		} else {
			if ((getMyX() == 0) || 
					getMyX() == f.FIELD_SIZE -1) {
				return true;
			}
		}
		return false;
		
	}

}
