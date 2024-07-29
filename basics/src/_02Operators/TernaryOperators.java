package _02Operators;

public class TernaryOperators {
  public static void main(String[] args) {
    // ternary operators

    int number25 = 25;
    boolean booleanExpresion = (number25 <= 25) ? true:false;
    System.out.println(booleanExpresion);

    
    System.out.println("increment");
    for (int i = 0; i < 3; i++) {
      System.out.println(number25 ++);
    }

    System.out.println("decrement");

    for (int i = 0; i < 3; i++) {
      System.out.println(number25 --);
    }


    System.out.println("prefixed");

    for (int i = 0; i < 3; i++) {
      System.out.println(++number25);
    }


    System.out.println("postfixed");

    for (int i = 0; i < 3; i++) {
      System.out.println(-- number25);
    }

  }
}
