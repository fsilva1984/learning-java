package test;

public class TemplateString {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("My name is ");

    String[] names = {"Jhon", "Kolb", "Ayub", "Nhoan", "Reis"};
    for (String name : names) {
      str.append(name).append(", ");
      System.out.println(str.toString());
    }

  }

}