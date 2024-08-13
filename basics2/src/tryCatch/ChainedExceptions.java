package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChainedExceptions {
  public static void main(String[] args) {

    try {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o seu nome");
      String name = sc.next();

      System.out.println("Digite um sua idade");
      int age = sc.nextInt();

      System.out.println("Digite um sua altura");
      double heigth = sc.nextDouble();

      String info = String.format("Nome: %s\nidade: %d\naltura: %.2f", name, age, heigth);
      System.out.println("\n" + info);

      sc.close();

    } catch (InputMismatchException e) {

      System.out.println(
          "\nErro no preenchimento://DICA: tente trocar a virgula por ponto.\n exemplo:\nWeligton\n45\n1.78\n");

      try {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String name = sc.next();

        System.out.println("Digite um sua idade");
        int age = sc.nextInt();

        System.out.println("Digite um sua altura");
        double heigth = sc.nextDouble();

        String info = String.format("Nome: %s\nidade: %d\naltura: %.2f", name, age, heigth);
        System.out.println(info);

        sc.close();

      } catch (Exception error) {

        System.out.println("\nErro no preenchimento: Tente novamente");
      }

    }

  }
}
