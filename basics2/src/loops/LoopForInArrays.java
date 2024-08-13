package loops;

public class LoopForInArrays {
  public static void main(String[] args) {
    // use for in array
    String[] fruits = {"Manga", "Uva", "Pera", "Maçã"};

    System.out.println("Iterando arrays com o FOR");
    for (int fruit = 0; fruit < fruits.length; fruit++){

      String index = String.format("\tindex %d = %s", fruit, fruits[fruit]);
      System.out.println(index);
    }

    // use foreach in array
    String[] students = {"Marcos", "Lucas", "Mateus", "João"};

    System.out.println("Iterando arrays com o FOREACH");
    for (String student : students) {
      String index = String.format("\taluno = %s", student);
      System.out.println(index); 
    } 
  }
}
