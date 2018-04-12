package stage3_4;

public class Yearly extends Appointment {

	
	public Yearly(String description,
			int year,
			int month,
			int day) {
		super(description, year, month, day);
	}

	@Override
	public boolean occursOn(int year, int month, int day) {
		if ((this.day == day) &&
				(this.month == month)) {
			return true;
		}
		return false;
	}
	
	public String getSaveString() {
		return "Y" + ", " + super.getSaveString();
	}
	
}
