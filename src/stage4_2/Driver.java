package stage4_2;

public class Driver {
	
	public static void main(String[] args) {
		
		BorrowerCount bc = new BorrowerCount();
		
		bc.addBorrower("Tyson");
		bc.addBorrower("Steve");
		bc.addBorrower("Jordan P.");
		bc.addBorrower("Jordan P.");
		bc.addBorrower("Jordan W.");
		bc.addBorrower("Tyson");
		bc.addBorrower("Ali");
		
		System.out.println("Borrower Count: " + bc.getBorrowerCount());
		System.out.println("Uniqe Borrower Count: " + bc.getUniqueBorrowerCount());
		
		
		
		
	}

}
