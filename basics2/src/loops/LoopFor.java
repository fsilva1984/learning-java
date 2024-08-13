package loops;

import java.util.Scanner;

public class LoopFor {
  public static void main(String[] args) {
    // use loop for

    Scanner sc = new Scanner(System.in);

    System.out.println("Escolha um numero para formar a tabuada");
    int number = sc.nextInt();

    for (int i = 1; i <= 10; i++) {

      int multiplicationResult = i * number;

      String multiplicationTableOf = String.format("%d x %d = %d", i, number, multiplicationResult);
      System.out.println(multiplicationTableOf);

    }

    sc.close();
  }
}
