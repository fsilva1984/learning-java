package interfaces;

public class Duck implements FlyingAnimal, WalkingAnimal, AnimalThatSwims {

  // private propriety
  private String duckFly;
  private String duckSwims;
  private String duckWalking;

  public String getDuckFly() {
    return duckFly;
  }

  public void setDuckFly(String duckFly) {
    this.duckFly = duckFly;
  }

  public String getDuckWalking() {
    return duckWalking;
  }

  public void setDuckWalking(String duckWalking) {
    this.duckWalking = duckWalking;
  }

  public String getDuckSwims() {
    return duckSwims;
  }

  public void setDuckSwims(String duckSwims) {
    this.duckSwims = duckSwims;
  }

  // inherited methos

  @Override
  public String fly() {
    return "O pato esta voando..";
  };

  @Override
  public String walking() {
    return "O pato esta caminhando.";
  };

  @Override
  public String swims() {
    return "O pato esta nadando..";
  };

  // class method
  public String flyingDuck() {
    setDuckFly(fly());
    return getDuckFly();
  };

  public String swimmingDuck() {
    setDuckSwims(swims());
    return getDuckSwims();
  };

  public String duckWalking() {
    setDuckWalking(walking());
    return getDuckWalking();
  };
}
