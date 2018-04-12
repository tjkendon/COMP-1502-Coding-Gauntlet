package stage3_1;

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

	
	
}
