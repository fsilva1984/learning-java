package fluxControl;

import java.util.Scanner;

public class ConditionalChaining {
  public static void main(String[] args) {
    // conditional chaining

    Scanner sc = new Scanner(System.in);

    // loan

    System.out.println("Valor do saque");
    int withdraw = sc.nextInt();

    if (withdraw <= valueInAccount) {
      String msg = String.format("O valor %.2f já está sendo liberado", withdraw);
      System.out.println(msg);

    } else if (withdraw > valueInAccount) {

      double loan = withdraw - valueInAccount;
      String msg = String.format("O valor %d está acima do limite: %.2f, deseja fazer um emprestimo de %.2f",
          withdraw, valueInAccount, loan);
      System.out.println(msg);
      System.out.printf("Se sim digite o valor: %.2f\n", loan);
      System.out.println("Caso contrario digite 0 para encerrar");

      response = sc.nextDouble();

      if (response > 0) {

        double total = valueInAccount + response;
        String message = String.format("O valor %.2f ja esta liberado em sua conta", total);
        System.out.println(message);
      }

    }
    System.out.println("Obrigado por usar nosso sistema");

    sc.close();
  }

  static double valueInAccount = 1453.33;
  static double response = 0;
}
