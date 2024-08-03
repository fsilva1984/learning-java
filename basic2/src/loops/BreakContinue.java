package loops;

import java.util.Scanner;

public class BreakContinue {
  public static void main(String[] args) {
    // using break e continue

    Scanner sc = new Scanner(System.in);
    
    System.out.println("informe um numero de parada entre 1 e 20");
    int number = sc.nextInt();

    for (int i = 0; i <= 20; i++) {

      if (number % 2 != 0) {
       System.out.println("não pode ser numero impa!");
        break;

      } else if (number == i) {
        System.out.println("pulamos o seu numero");
        continue;

      } else {
        System.out.println(i);
      }

    }
    
    sc.close();
  }
}
