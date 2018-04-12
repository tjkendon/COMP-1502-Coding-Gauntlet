package stage3_2;


public class Book extends Media {

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
	
	public boolean equals(Object o) {
		
		if ((o != null) && (o instanceof Book)) {
			Book b = (Book) o;
			if ((this.getAuthor().equals(b.getAuthor())) &&
					this.getWordCount() == b.getWordCount() &&
					super.equals(b)) 
				 {
				return true;
			}
			
		}
		return false;
		
	}
	
	

}
