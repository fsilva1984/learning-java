package polymorphism;

public class Trapezoid extends Parallelogram {
  // inherited method
  protected double calculator(double a, double b) {
    return a + b / 2;
  };

  public double getBasisA() {
    return basisA;
  }

  public void setBasisa(double basisA) {
    this.basisA = basisA;
  }

  private double basisA;
  private double basisB;
  private double height;

  public double getBasisB() {
    return basisB;
  }

  public void setBasisB(double basisB) {
    this.basisB = basisB;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double trapezoidCalculation() {
    return (calculator(getBasisA(), getBasisB())) * getHeight();
  }

}
