package com.yt.john_marty.junit5;

import com.yt.john_marty.junit5.SimpleCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
	@Test
	void twoPlushTwoEqualFour() {
		// GIVEN
		int expectedResult = 4;

		// com.yt.john_marty.junit5.SimpleCalculator calculator = new com.yt.john_marty.junit5.SimpleCalculator();
		var calculator = new SimpleCalculator();

		// WHEN
		int actualResult = calculator.add(2, 2);

		// THEN
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void threePlushSevenEqualTen() {
		// GIVEN
		int expectedResult = 10;

		// com.yt.john_marty.junit5.SimpleCalculator calculator = new com.yt.john_marty.junit5.SimpleCalculator();
		var calculator = new SimpleCalculator();

		// WHEN
		int actualResult = calculator.add(3, 7);

		// THEN
		assertEquals(expectedResult, actualResult);
	}
}