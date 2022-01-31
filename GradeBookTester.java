import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester 
{

	private GradeBook student1;
	private GradeBook student2;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		student1 = new GradeBook(5);
		student2 = new GradeBook(5);
		
		student1.addScore(66.5);
		student1.addScore(89.5);
		student2.addScore(75.1);
		student2.addScore(20.8);

	}

	@AfterEach
	void tearDown() throws Exception 
	{
		student1 = null;
		student2 = null;
	}

	@Test
	void testAddScore() 
	{
		assertTrue(student1.toString().equals("66.5 89.5 "));
		assertEquals(2, student1.getScoresSize(), "returns score size");
		assertTrue(student2.toString().equals("75.1 20.8 "));
		assertEquals(2, student2.getScoresSize(), "returns score size");
	}

	@Test
	void testSum() 
	{
		assertEquals(156, student1.sum(), .0001);
		assertEquals(95.9, student2.sum(), .0001);
	}

	@Test
	void testMinimum() 
	{
		assertEquals(66.5, student1.minimum(), .0001);
		assertEquals(20.8, student2.minimum(), .0001);
	}

	@Test
	void testGetScoreSize() 
	{
		assertEquals(2, student1.getScoresSize(), "return the number of scores");
	}

	@Test
	void testToString() 
	{
		assertEquals("66.5 89.5 ", student1.toString(), "returns a string of the array values spaced");
		assertEquals("75.1 20.8 ", student2.toString(), "returns a string of the array values spaced");
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(89.5, student1.finalScore(), .0001);
		assertEquals(75.1, student2.finalScore(), .0001);
	}

}
