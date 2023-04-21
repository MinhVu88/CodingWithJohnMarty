/*
The formula for Mortgage Payment: M = P [{r(1+r)^n}/{(1+r)^n – 1}]

  - M = Monthly payment
  - P = principal
  - r = rate
  - n = number of payments

  -> Reference: https://javatutoring.com/java-mortgage-payment/
*/
package main.java.com.yt.john_Marty.mortgage_calculator;

import java.text.NumberFormat;
import java.util.Scanner;

class MortgageCalculator {
  double monthlyPayment, totalPayment;

  MortgageCalculator(double principleAmount, double monthlyInterestRate, int numberOfPayments) {
    monthlyPayment = principleAmount * (
      (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) / 
      ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1)
    );

    // monthlyPayment = Math.round(monthlyPayment * 100) / 100;

    totalPayment = monthlyPayment * numberOfPayments;
  }
}

public class Main {
  private static final int MONTHS_PER_YEAR = 12;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("enter the principle amount: $");
    double principleAmount = scanner.nextDouble();

    System.out.println();

    System.out.print("enter the annual interest rate: ");
    float annualInterestRate = scanner.nextFloat();

    System.out.println();

    System.out.print("enter the term in years: ");
    int termInYears = scanner.nextInt();

    float monthlyInterestRate = (annualInterestRate / 100) / MONTHS_PER_YEAR;

    int numberOfPayments = termInYears * MONTHS_PER_YEAR;

    MortgageCalculator mortgageCalculator = new MortgageCalculator(principleAmount, monthlyInterestRate, numberOfPayments);

    System.out.println(
      "\n-> mortgage monthly payment: " + 
      NumberFormat.getCurrencyInstance().format(mortgageCalculator.monthlyPayment)
    );

    System.out.println(
      "\n-> mortgage total payment: " +
      NumberFormat.getCurrencyInstance().format(mortgageCalculator.totalPayment)
    );

    scanner.close();
  }
}
