package stage3_4;

public class OneTime extends Appointment {

	
	public OneTime(String description,
			int year,
			int month,
			int day) {
		super(description, year, month, day);
	}

	@Override
	public boolean occursOn(int year, int month, int day) {
		if ((this.day == day) &&
				(this.month == month) &&
				(this.year == year)) {
			return true;
		}
		return false;
	}
	
	public String getSaveString() {
		return "O" + ", " + super.getSaveString();
	}
	
}
