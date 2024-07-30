package _03dataInput;

public class Arguments {
  public static void main(String[] args) {

    // getting arguments via terminal
    String name = args[0];
    String age = args[1];
    String height = args[2];

    System.out.println("\tNome: ".concat(name));
    System.out.println("\tIdade: ".concat(age));
    System.out.println("\tAltura: ".concat(height));
  }
}
