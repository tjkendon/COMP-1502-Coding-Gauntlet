package stage3_3;

public class Monthly extends Appointment{
	
	public Monthly(String description,
			int year,
			int month,
			int day) {
		super(description, year, month, day);
	}

	@Override
	public boolean occursOn(int year, int month, int day) {

		if (this.day == day) {
			return true;
		}
		return false;
		
	}
	

}
