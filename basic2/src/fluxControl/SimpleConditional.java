package fluxControl;

import java.util.Scanner;

public class SimpleConditional {
public static void main(String[] args) {
  // simple flux control, with if else

  Scanner sc = new Scanner(System.in);

  System.out.println("digite um valor inteiro acima de 25 mas abaixo de 30");
  int number = sc.nextInt();

  if (number >= 25 && number <= 29) {
    String msg = String.format("numero digitado %d Parabens numero aceito", number);
    System.out.println(msg);
  } else {

    String msg = String.format("numero digitado %d numero recusado", number);
    System.out.println(msg);
    
  }

  sc.close();
}
}
