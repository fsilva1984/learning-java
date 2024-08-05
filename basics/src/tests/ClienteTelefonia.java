package tests;

import java.util.Scanner;

public class ClienteTelefonia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada do serviço a ser verificado
    String servico = scanner.nextLine().trim();

    // Entrada do nome do cliente e os serviços contratados
    String entradaCliente = scanner.nextLine().trim();

    // Separando o nome do cliente e os serviços contratados
    String[] partes = entradaCliente.split(",");
    String nomeCliente = partes[0];
    boolean contratado = false;

    for (String parte : partes) {
      if (servico.equalsIgnoreCase(parte)) {
        contratado = true;
        break;
      } else {
        contratado = false;
      }
    }

    if (contratado) {
      System.out.println(nomeCliente);
      System.out.println("servico contratado: " + "Sim");
    } else {
      System.out.println(nomeCliente);
      System.out.println("servico contratado: " + "Nao");
    }

    scanner.close();

  }


}
