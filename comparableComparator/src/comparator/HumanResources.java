package comparator;

import java.util.Comparator;

import comparable.Person;

public class HumanResources implements Comparator<Person> {

  @Override
  public int compare(Person p1, Person p2) {
    return p1.getName().compareTo(p2.getName());
  }
}
