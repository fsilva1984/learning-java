package polymorphism;

public class GeometricCalculator {

  public static void main(String[] args) {

    Square square = new Square();
    square.setB(12.6);
    square.setH(18.22);
    String result = String.format(
        "Area total do quadrado: %.2f",
        square.squareCalculation());

    System.out.println(result);

    // -------------------------------------------------------- \\

    Kite kite = new Kite();
    kite.setDiagonal1(26);
    kite.setDiagonal2(18.9);
    String kiteCalculationResult = String.format(
        "Area Total da Pipa: %.2f",
        kite.kiteCalculation());
    System.out.println(kiteCalculationResult);

    // -------------------------------------------------------- \\

    Trapezoid trapezoid = new Trapezoid();
    trapezoid.setBasisa(12.0);
    trapezoid.setBasisB(18.16);
    trapezoid.setHeight(23.5);
    String resultTrapezoidCalculation = String.format(
        "Area Total do Trapézio: %.2f",
        trapezoid.trapezoidCalculation());
    System.out.println(resultTrapezoidCalculation);
  }
}
