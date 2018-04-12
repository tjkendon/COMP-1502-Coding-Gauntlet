package stage3_1;

public class FictionBook extends Book {

	private String genre;
	
	public FictionBook(
			String title, 
			String publisher, 
			int year, 
			String author, 
			int wordCount,
			String genre) {
		super(title, publisher, year, author, wordCount);
		this.genre = genre;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public String toString() {
		return super.toString() + " " + this.genre;
	}
	

}
