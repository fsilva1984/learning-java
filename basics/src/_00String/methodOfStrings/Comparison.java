package _00String.methodOfStrings;

public class Comparison {
public static void main(String[] args) {
  // best way to compare

  // use to compare reference content
  String name1 = "Flavio";
  String name2 = "Flavi";

  boolean compareVariables = (name1 == name2) ? true:false;

  System.out.println("Resultado usando o == : " + compareVariables + "\n");


  // use to compare contents of objects
  String name3 = new String("Silva");
  String name4 = new String("Silva");

  boolean compareObjects = name3.equals(name4);

  System.out.printf("Resultado usando o equals: " + compareObjects + "\n");


  
}
}
