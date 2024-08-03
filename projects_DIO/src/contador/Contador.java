package contador;

import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite dois numeros, o primeiro deve ser maior que o segundo");
    int entry1 = sc.nextInt();
    int entry2 = sc.nextInt();

    sc.close();

    try {
      double result = entriesUser(entry1, entry2);
      System.out.println("Resultado: "+ result);

    } catch (Exception e) {
      System.out.println("O primeiro numero, obrigatoriamente deve ser maior!.");
    }
  }

  static int entriesUser(int entry1, int entry2) throws Exception {
    if (entry1 < entry2) {
      throw new Exception();
    }
    int number = entry1 - entry2;
    return number;
  }

  static void iteratorOfNumber(int number) {
    int i = 0;
    while (i < number) {
      System.out.println();
    }
  }

}
