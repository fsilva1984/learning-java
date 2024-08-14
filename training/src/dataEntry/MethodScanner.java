package dataEntry;

import java.util.Locale;
import java.util.Scanner;

public class MethodScanner {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Informe Sue nome: ");
    String name = scanner.next();

    System.out.println("Informe Sua idade: ");
    int age = scanner.nextInt();

    System.out.println("Informe Sua altura: ");
    double height = scanner.nextDouble();

    String info = String.format("\tO aluno %s\n\ttem %d anos\n\te mede %.2f de altura", name, age, height);
    System.out.println(info);
    scanner.close();
  }
}
