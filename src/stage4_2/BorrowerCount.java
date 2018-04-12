package stage4_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BorrowerCount {

	List<String> borrowerList;
	Set<String> borrowerSet;
	
	public BorrowerCount() {
		borrowerList = new ArrayList<>();
		borrowerSet = new HashSet<>();
	}
	
	public void addBorrower(String borrower) {
		borrowerList.add(borrower);
		borrowerSet.add(borrower);
	}
	
	public int getBorrowerCount() {
		return borrowerList.size();
	}
	
	public int getUniqueBorrowerCount() {
		return borrowerSet.size();
	}
	
	
	
}
