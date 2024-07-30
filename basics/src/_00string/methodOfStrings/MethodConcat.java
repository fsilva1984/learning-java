package _00string.methodOfStrings;

public class MethodConcat {
  public static void main(String[] args) {
  
    // pattern
    // type nomeEndCleanObjetive(params)

    String firstName = "Flavio";
    String secondName = "Silva";

    String fullNameStr = fullName(firstName, secondName);
    System.out.println(fullNameStr);

    String nascidoEm = dataNascimento("18/05/1984");
    System.out.println(fullNameStr.concat(" Nascido em: ".concat(nascidoEm)));
  }

  public static String fullName(String firstName, String secondName) {
    return firstName.concat(" ".concat(secondName));
  }

  public static String dataNascimento(String dataNascimentoStr) {
    return "Data: ".concat(dataNascimentoStr);
  }
}
