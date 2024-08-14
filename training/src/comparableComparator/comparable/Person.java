package comparableComparator.comparable;

public class Person implements Comparable<Person> {

  private String name;
  private int age;

  // Constructor method of class
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  /*
   * implementing the compareTo method
   * of the interface
   */
  @Override
  public int compareTo(Person other) {
    return this.age - other.age;
  }
}
