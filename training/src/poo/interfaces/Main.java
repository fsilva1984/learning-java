package interfaces;

public class Main {
  public static void main(String[] args) {
    Duck duck = new Duck();

    System.out.println("");
    
    System.out.println(duck.swimmingDuck());
    System.out.println("\n----------------------------------\n");
    System.out.println(duck.duckWalking());
    System.out.println("\n----------------------------------\n");
    System.out.println(duck.flyingDuck());
  }
}
