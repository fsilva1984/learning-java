package _02Operators;

import java.lang.Math;

public class ArithmeticOperators {
  public static void main(String[] args) {
    // operators arithmetic

    for (int i = 0; i < 10; i++) {
      System.out.printf("\t %d X %d = %d\n", i, i, multiplication(i, 2));
    }

    System.out.println("\n");

    double number = 25;
    double total = squareRoot(number);

    System.out.printf(" A raiz quadrada de %.1f é %.1f", number, total);

    System.out.println("");

    System.out.println(convertNegativeForPositive(-16));
  }

  static int addition(int a, int b) {
    return a + b;
  }

  static int multiplication(int a, int b) {
    return a * b;
  }

  static float subtraction(float a, float b) {
    return a - b;
  }

  static double division(double a, int b) {
    return a / b;
  }

  static double leftoverFromDivision(double a, double b) {
    return a % b;
  }

  static double squareRoot(double number) {
    return Math.sqrt(number);
  }

  static double convertNegativeForPositive(double number) {
    return number = number * -1;
  }
}
