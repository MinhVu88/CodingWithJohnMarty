import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
	@Test
	void twoPlushTwoEqualFour() {
		int expectedResult = 4;

		// SimpleCalculator calculator = new SimpleCalculator();
		var calculator = new SimpleCalculator();

		int actualResult = calculator.add(2, 2);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	void threePlushSevenEqualTen() {
		int expectedResult = 10;

		// SimpleCalculator calculator = new SimpleCalculator();
		var calculator = new SimpleCalculator();

		int actualResult = calculator.add(3, 7);

		assertEquals(expectedResult, actualResult);
	}
}