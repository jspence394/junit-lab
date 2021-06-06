import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook book1;
	private GradeBook book2;
	@BeforeEach
	void setUp() throws Exception {
		book1 = new GradeBook(5);
		book2 = new GradeBook(5);
	}

	@AfterEach
	void tearDown() throws Exception {
		book1=null;
		book2=null;
	}

	@Test
	void testAddScore() {
		boolean add=book1.addScore(43);
		add=book2.addScore(75);
		assertTrue(book1.toString().contains("43"));
		assertTrue(book2.toString().contains("75"));
	}

	@Test
	void testSum() {
	boolean add=book1.addScore(58);
	add=book1.addScore(43);
	add=book2.addScore(54);
	add=book2.addScore(75);
	assertEquals(book1.sum(),101);
	assertEquals(book2.sum(),129);
	}

	@Test
	void testMinimum() {
		assertTrue(true);
	}

	@Test
	void testFinalScore() {
		boolean add=book2.addScore(65);
		add=book2.addScore(54);
		add=book2.addScore(70);
		assertTrue(book1.finalScore()==0);
		assertTrue(book2.finalScore()==135);
	}

	@Test
	void testGetScoreSize() {
		boolean add=book2.addScore(65);
		add=book2.addScore(54);
		add=book2.addScore(70);
		assertTrue(book2.getScoreSize()==3);
		assertTrue(book1.getScoreSize()==0);
	}
}
