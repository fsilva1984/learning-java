package polymorphism;

public class Square extends Parallelogram {

  // inherited method
  @Override
  protected double calculator(double b, double h) {
    return b * h;
  }

  private double b;
  private double h;

  public double getH() {
    return h;
  }

  public void setH(double h) {
    this.h = h;
  };

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  public double squareCalculation() {
    return calculator(getB(), getH());
  }

}
