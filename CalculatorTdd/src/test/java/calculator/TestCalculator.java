package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {

	Calculator calculator;
	
	@BeforeEach
	void setupCalculator() {
		calculator = new Calculator();
		
		calculator.add(1.0);
		calculator.add(2.0);
		calculator.add(4.0);
		calculator.add(1000.0);
	}
	
	@Test
	void testAverage() {
		
		try {
			assertEquals(1007.00/4, calculator.average(), .01);
		} catch (NoElementsException e) {
			fail("Caught NoElementsException");
			e.printStackTrace();
		}
		
	}
	
	@Test
	void testEmpty() {
		Calculator calculator = new Calculator();
		
		try {
			calculator.average();
			fail("Should have had an exception");
		}
		catch(NoElementsException e) {
			
		}
		
		
	}
	
	@Test
	void testMedian() {
		
		//this is incorrect, the algorithm actually 
		// chooses the ceil of the middle value of the array
		assertEquals(4, calculator.median(), 0.01);
		
	}
	
	

}
