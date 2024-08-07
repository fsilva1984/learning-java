package javaConstructors;

public class Person {

  private int age;
  private String addrs;
  private final String NAME;
  private final String NSS;

  /*
   * The attribute values ​​are defined in the constructor
   *  itself, thus replacing the settrs method.
   */
  public Person(String NAME, String NSS) {
    this.NAME = NAME;
    this.NSS = NSS;
  }

  public void setAddrs(String addrs) {
    this.addrs = addrs;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getNAME() {
    return NAME;
  }

  public String getNSS() {
    return NSS;
  }

  public int getAge() {
    return age;
  }

  public String getAddrs() {
    return addrs;
  }

}
