package collections.set.phonebook;

public class Contacts {
  private String name;
  private long number;

  public Contacts(String name, long number) {
    this.name = name;
    this.number = number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public long getNumber() {
    return number;
  }

  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Contacts other = (Contacts) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "\nContato name: " + name + ", number: " + number+"\n";
  }

}
