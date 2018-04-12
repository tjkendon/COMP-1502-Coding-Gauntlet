package stage4_4;


public abstract class Book extends Media {

	private String author;
	private int wordCount;
	
	public Book(String title, String publisher, int year, String author, int wordCount) {
		super(title, publisher, year);
		this.author = author;
		this.wordCount = wordCount;
	}

	public String getAuthor() {
		return author;
	}

	public int getWordCount() {
		return wordCount;
	}
	
	public String toString() {
		
		return super.toString() + " " + author + " " + wordCount;
		
	}
	
	

}
