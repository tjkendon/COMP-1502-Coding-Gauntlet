package stage2_5;

public class CannonBall {
	
	private double xPosition;
	private double yPosition;
	
	private double xVelocity;
	private double yVelocity;
	
	private static final double GRAVITY = -9.81;
	
	private static final double STEP = 0.1;
	
	public CannonBall(double xPosition) {
		this.xPosition = xPosition;
		this.yPosition = 0;
	}
	
	public double getX() {
		return xPosition;
	}
	
	public double getY() {
		return yPosition;
	}
	
	public void move (double time) {
		xPosition += xVelocity * time;
		yPosition += yVelocity * time;
		
		yVelocity += GRAVITY * time;
		
	}
	
	public void shoot(double angle, double initialVelocity) {
		xVelocity = Math.cos(angle) * initialVelocity;
		yVelocity = Math.sin(angle) * initialVelocity;
		
		double time = 0;
		
		do {
			move(STEP);
			time += STEP;
			System.out.println(time + ": " + xPosition + ", " + yPosition);
		} while (yPosition > 0);
		
	}
	
	
	
	

}
