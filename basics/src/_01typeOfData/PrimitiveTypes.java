package _01typeOfData;

public class PrimitiveTypes {
  public static void main(String[] args) {
    // Eight primitive types of the Java language

    String primitiveTypes [] = {"int", "byte", "short", "long", "float", "double", "boolean", "char"};

    String types = "Os tipos primitivos da linguagem java são:";
    System.out.println(types);

    for(String type : primitiveTypes){
      System.out.println("\t".concat(type));
    }

  }
}
