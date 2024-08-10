package polymorphism;

public class Kite extends Parallelogram {
  // inheited method
  @Override
  protected double calculator(double diagonal1, double diagonal2) {
    return (diagonal1 * diagonal2) / 2;
  };

  private double diagonal1;
  private double diagonal2;

  public double getDiagonal1() {
    return diagonal1;
  }

  public void setDiagonal1(double diagonal1) {
    this.diagonal1 = diagonal1;
  }

  public double getDiagonal2() {
    return diagonal2;
  }

  public void setDiagonal2(double diagonal2) {
    this.diagonal2 = diagonal2;
  }

  public double kiteCalculation() {
    return calculator(getDiagonal1(), getDiagonal2());
  }
}
