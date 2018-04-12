package stage3_2;

public class Media {

	private String title;
	private String publisher;
	private int year;
	
	public Media (String title, String publisher, int year) {
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
	
	
	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return title + " " + publisher + " " + year;
	}
	
	public boolean equals(Object o) {
		
		if ((o != null) && (o instanceof Media)) {
			Media m = (Media) o;
			if (this.getTitle().equals(m.getTitle()) &&
					this.getPublisher().equals(m.getPublisher()) &&
					this.getYear() == m.getYear()) {
				return true;
			}
			
		}
		return false;
		
	}
	
	
}
