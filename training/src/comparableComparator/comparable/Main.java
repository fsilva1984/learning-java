package comparableComparator.comparable;

import java.util.Arrays;
import java.util.Comparator;

import comparableComparator.comparator.HumanResources;



public class Main {
  public static void main(String[] args) {
    Person[] persons = new Person[5];

    persons[0] = new Person("Carlos", 45);
    persons[1] = new Person("Beatriz", 36);
    persons[2] = new Person("Carvalho", 47);
    persons[3] = new Person("Miley", 23);
    persons[4] = new Person("Nadia", 31);

    System.out.println(
        "\n---------------------------------------------\n");
    System.out.println(
        "** ORGANIZANDO NOME POR ORDEM NUMERICA **\n");
    Arrays.sort(persons);
    for (Person person : persons) {
      String ordenadForAge = String.format("Name: %s, Age: %d",
          person.getName(), person.getAge());
      System.out.println(ordenadForAge);
    }

    System.out.println(
        "\n---------------------------------------------\n");
    System.out.println(
        "** ORGANIZANDO NOME POR ORDEM ALFABETICA **\n");
    Comparator<Person> names = new HumanResources();

    /***************************************
     * invoking the compare method of the
     * class that implements the Comparator
     * interface
     ***************************************/
    Arrays.sort(persons, names);
    for (Person person : persons) {
      String personName = String.format("Nome: %s Idade: %d", person.getName(), person.getAge());
      System.out.println(personName);
    }
  }
}
