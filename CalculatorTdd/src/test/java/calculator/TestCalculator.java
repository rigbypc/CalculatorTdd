package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {

	@Test
	void testAverage() {
		Calculator calculator = new Calculator();
		
		calculator.add(1.0);
		calculator.add(2.0);
		calculator.add(1000.0);
		
		try {
			assertEquals(334.34, calculator.average(), .01);
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
		
		Calculator calculator = new Calculator();
		
		calculator.add(1.0);
		calculator.add(2.0);
		calculator.add(1000.0);
		
		assertEquals(2.0, calculator.median(), 0.01);
		
	}
	
	

}
