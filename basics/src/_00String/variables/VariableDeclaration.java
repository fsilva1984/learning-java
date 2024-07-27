package _00String.variables;

public class VariableDeclaration {
  public static void main(String[] args) {
    // variable naming

    // pattern camelCase
    String worldList = "Pão Baicon Leite Café Canela Queijo";
    System.out.println(worldList);

    // pattern positive naming
    String _positivePattrer = "Pode começa com underscore";
    System.out.println(_positivePattrer);

    String $positivePattrer = "Pode começa com sifrão";
    System.out.println($positivePattrer);

    // pattern negative naming.
    String negativePatternList = "Não começa com numeros, nem com nenhum outro simbulo\nque não seja o underscore ou sifrão, nem pode conter espaço";
    System.out.println(negativePatternList);

    // what the variable represents
    String inputDate = "18/04/2023";
    String fullName = "Flavio F Silva";
    System.out.println(inputDate);
    System.out.println(fullName);
  }
}
