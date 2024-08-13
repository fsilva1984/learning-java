package debug;

public class DebugCodeJava {
  public static void main(String[] args) {
    System.out.println("Iniciou o metodo 'Main'");
    methodA();

    System.out.println("Saiu do metodo 'Main'");
  }

  static void methodA() {
    System.out.println("Iniciou o metodo 'A' ");
    methodB();
    System.out.println("Saiu do metodo 'A'");
  }

  static void methodB() {
    System.out.println("Iniciou o metodo 'B' ");
    methodC();
    System.out.println("Saiu do metodo 'B'");
  }

  static void methodC() {
    System.out.println("Iniciou o metodo 'C' ");

    for (int i = 1; i <= 4; i++) {
      System.out.println(i);
    }
    methodD();

    System.out.println("Saiu do metodo 'C'");
  }

  static void methodD() {
    System.out.println("Iniciou o metodo 'D' ");
    //Thread.dumpStack(); // view the execution stack
    System.out.println("Saiu do metodo 'D'");
  }
}
