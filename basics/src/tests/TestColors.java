package tests;

public class TestColors {
  public static void main(String[] args) {
    System.out.println(multiple(8));
  }

  static String variable = "anywhere";

  static String function(String param) {
    return param;
  }

  // this is just a comment

  static int sumNumbers(int a, int b) {
    return a + b;
  }


  static double multiple(double number) {
    return number *  sumNumbers(25, 42);
  }

  static String [] arrayOfNames = {
    "Welligton",
    "Justbeyber",
    "Cammargo"
  };
}
