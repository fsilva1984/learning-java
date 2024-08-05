package visibilityOfClasses.visibilityDefault;
import visibilityOfClasses.visibilityPublic.Car;

public class Exec {
/*
 * classes with public visibility can be seen and 
 * invoked within any other
 * package in the project
 */
  public static void main(String[] args) {
    ElectricalStructure instance = new ElectricalStructure();

    Car car = new Car();

    instance.dashboard();

    System.out.println("");

    instance.headlightsAndTaillights(0);


    car.carColor();
    car.modelAndManufacturer();

  }
}

/*
 * classes with default visibility can only be seen
 * by classes within the same
 * package
 */

class ElectricalStructure {

  void dashboard() {
    System.out.println("Eletrica do Painel: acende todo o painel deixando as funções do carro visiveis");
  }

  void headlightsAndTaillights(int arg) {
    System.out.println("Eletrica dos farois lanternas e interior: ");
    String[] powerOn = { "Farois", "Lanternas", "Luzes internas" };

    switch (arg) {
      case 0:
        System.out.println("Acender: " + powerOn[0]);
        break;

      case 1:
        System.out.println("Acender: " + powerOn[1]);
        break;

      case 2:
        System.out.println("Acender: " + powerOn[2]);
        break;
    }
  }
}

