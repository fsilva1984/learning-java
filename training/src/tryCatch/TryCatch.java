package tryCatch;

import java.util.Scanner;

public class TryCatch {
  public static void main(String[] args) {

    // try catch

    try {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite a sua altura usando virgula");
      double number = sc.nextDouble();

      System.out.printf("\nSua altura: %.2f\n", number);
      sc.close();
    } catch (Exception e) {
      System.out.println("Tente novamente e troque a virgula por ponto");
    }
  }
}
