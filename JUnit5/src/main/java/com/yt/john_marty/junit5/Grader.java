package com.yt.john_marty.junit5;

public class Grader {
	public char getLetterGrade(int numericGrade) {
		if(numericGrade < 0) {
			throw new IllegalArgumentException("numeric grade must be positive");
		} else if(numericGrade < 60) {
			return 'F';
		} else if(numericGrade < 70) {
			return 'D';
		} else if(numericGrade < 80) {
			return 'C';
		} else if(numericGrade < 90) {
			return 'B';
		} else {
			return 'A';
		}
	}
}
