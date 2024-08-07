package theFivePillarsOfPOO;

import java.util.concurrent.ThreadLocalRandom;

public class Vehicle {
  private long chassi;

  public void setChassi(long chassi) {
    this.chassi = chassi;
  }

  public long getChassi() {
    return chassi;
  }

  public void turnOnVehicle() {
    System.out.println(checkFuel(fuelLevel()));
  }

  /*
   * abstraction concept, the methods below return a
   * value, are restricted to this
   * class only
   */
  protected static String checkFuel(int level) {
    String levelFuel = "";
    if (level < 6 && level >= 4) {
      levelFuel = "Combustivel acima do meio, ligando o veiculo";
    } else if (level <= 3 && level > 1) {
      levelFuel = "combustivel na reserva, ligando o veiculo";
    } else {
      levelFuel = "sem combustivel";
    }
    return levelFuel;
  }

  protected static int fuelLevel() {
    return ThreadLocalRandom.current().nextInt(0, 6);
  }
}
