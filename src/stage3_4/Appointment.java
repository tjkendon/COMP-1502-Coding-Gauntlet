package stage3_4;

public abstract class Appointment {
	
	private String description;
	protected int year;
	protected int month;
	protected int day;
	
	public Appointment(String description,
			int year,
			int month,
			int day) {
		
		this.description = description;
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	
	public String toString() {
		return day + "/" + month + "/" + year + " - " + description;
	}
	
	public String getSaveString() {
		
		return year + ", " + month + ", " + day + ", " + description;
		
	}
	
	public abstract boolean occursOn(int year, int month, int day);

}
