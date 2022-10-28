package com.yt.john_marty.junit5;

import com.yt.john_marty.junit5.Grader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
	@Test
	void fiftyNineShouldReturnF() {
		// GIVEN
		char expectedResult = 'F';

		var grader = new Grader();

		// WHEN
		char actualResult = grader.getLetterGrade(59);

		// THEN
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void sixtyNineShouldReturnD() {
		// GIVEN
		char expectedResult = 'D';

		var grader = new Grader();

		// WHEN
		char actualResult = grader.getLetterGrade(69);

		// THEN
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void seventyNineShouldReturnC() {
		// GIVEN
		char expectedResult = 'C';

		var grader = new Grader();

		// WHEN
		char actualResult = grader.getLetterGrade(79);

		// THEN
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void eightyNineShouldReturnB() {
		// GIVEN
		char expectedResult = 'B';

		var grader = new Grader();

		// WHEN
		char actualResult = grader.getLetterGrade(89);

		// THEN
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void ninetyNineShouldReturnA() {
		// GIVEN
		char expectedResult = 'A';

		var grader = new Grader();

		// WHEN
		char actualResult = grader.getLetterGrade(99);

		// THEN
		assertEquals(expectedResult, actualResult);
	}

	// handle edge cases
	@Test
	void zeroShouldReturnF() {
		// GIVEN
		char expectedResult = 'F';

		var grader = new Grader();

		// WHEN
		char actualResult = grader.getLetterGrade(0);

		// THEN
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void sixtyShouldReturnD() {
		// GIVEN
		char expectedResult = 'D';

		var grader = new Grader();

		// WHEN
		char actualResult = grader.getLetterGrade(60);

		// THEN
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void seventyShouldReturnC() {
		// GIVEN
		char expectedResult = 'C';

		var grader = new Grader();

		// WHEN
		char actualResult = grader.getLetterGrade(70);

		// THEN
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void eightyShouldReturnB() {
		// GIVEN
		char expectedResult = 'B';

		var grader = new Grader();

		// WHEN
		char actualResult = grader.getLetterGrade(80);

		// THEN
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void ninetyShouldReturnA() {
		// GIVEN
		char expectedResult = 'A';

		var grader = new Grader();

		// WHEN
		char actualResult = grader.getLetterGrade(90);

		// THEN
		assertEquals(expectedResult, actualResult);
	}

	// assert a thrown exception
	@Test
	void negativeOneShouldThrowIllegalArgumentException() {
		// GIVEN
		var grader = new Grader();

		// WHEN
		Executable executable = () -> grader.getLetterGrade(-1);

		// THEN
		assertThrows(IllegalArgumentException.class, executable);
	}
}
