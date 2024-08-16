package collections.list.toDoList;

public class Tasks {
  private String description;

  public Tasks(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
  
  @Override
  public String toString() {
    return description;
  }
}
