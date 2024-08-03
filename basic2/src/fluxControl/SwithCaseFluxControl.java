package fluxControl;

public class SwithCaseFluxControl {
  public static void main(String[] args) {
    // flux contol whith swith case.

    char control = 'a';

    switch (control) {
      case 'y':
        System.out.println("Em frente");
        break;

      case 'x':
        System.out.println("Vira para direita");
        break;

      case 'a':
        System.out.println("Vira para esquerda");
        break;

      case 'b':
        System.out.println("Retroceder");
        break;

      default:
        System.out.println("Esta parado");
    }
  }
}
