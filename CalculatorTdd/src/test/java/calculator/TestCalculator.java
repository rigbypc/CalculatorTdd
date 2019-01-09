package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {

	@Test
	void test() {
		Calculator calculator = new Calculator();
		
		calculator.add(1.0);
		calculator.add(3.0);
		calculator.add(1000.0);
		
		assertEquals(334.34, calculator.average(), .01);
		
	}

}
