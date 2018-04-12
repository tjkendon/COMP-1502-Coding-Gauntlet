package stage4_4;

public abstract class Media implements Comparable<Media>{

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
	
	
}
