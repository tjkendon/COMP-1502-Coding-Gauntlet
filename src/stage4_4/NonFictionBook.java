package stage4_4;

public class NonFictionBook extends Book{

	private String topic;
	private String callNumber;
	
	public NonFictionBook(
			String title, 
			String publisher, 
			int year, 
			String author, 
			int wordCount,
			String topic,
			String callNumber) {
		super(title, publisher, year, author, wordCount);
		
		this.topic = topic;
		this.callNumber = callNumber;
	
	}

	public String getTopic() {
		return topic;
	}

	public String getCallNumber() {
		return callNumber;
	}
	
	public String toString() {
		return super.toString() + " " + topic + " " + callNumber;
	}
	
	@Override
	public int compareTo(Media o) {
		if (o instanceof NonFictionBook) {
			return this.getCallNumber().compareTo(((NonFictionBook) o).getCallNumber());
		}
		else if (o instanceof FictionBook) {
			return -1;
		}
		return 1;
	}

	
	
}
