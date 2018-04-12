package stage5_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BorrowCountTest {

	/*
	 * Test Plan
	 * 
	 * New BorrowerCount  - 0 borrowers
	 * 
	 * test one borrower | new bc, add 1 | count = 1, unique count = 1
	 * test two different borrower | new bc, add 2 (different) | count = 2, unique count = 2  
	 * test one borrower twice | new bc, add 1 add again | count = 2, unique count = 1
	 * 
	 * 
	 * 
	 */
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOneBorrower() {
		BorrowerCount bc = new BorrowerCount();
		
		bc.addBorrower("Steve");
		
		assertEquals(1, bc.getBorrowerCount());
		assertEquals(1,  bc.getUniqueBorrowerCount());
		
	}
	
	@Test
	public void testTwoBorrowers() {
		BorrowerCount bc = new BorrowerCount();
		
		bc.addBorrower("Steve");
		bc.addBorrower("Jordan");
		
		assertEquals(2, bc.getBorrowerCount());
		assertEquals(2,  bc.getUniqueBorrowerCount());
		
	}
	
	@Test
	public void testOneBorrowerTwice() {
		BorrowerCount bc = new BorrowerCount();
		
		bc.addBorrower("Steve");
		bc.addBorrower("Steve");
		
		assertEquals(2, bc.getBorrowerCount());
		assertEquals(1,  bc.getUniqueBorrowerCount());
		
	}

}
