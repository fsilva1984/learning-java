package collections.list.toDoList;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
  private List<Tasks> task;

  // the class constructor creates an empty generic list
  public ToDoList() {
    this.task = new ArrayList<>();
  }

  // this method adds new objects to the generic list
  public void addTasks(String desciption) {
    task.add(new Tasks(desciption));
  }

  /**************************************************************
   * the parameter that the function receives will be checked
   * if it exists in the original list, if it exists a new list
   * will be created with the names to be removed, after that we
   * will pass this new list to the (removeAll) method of
   * the original list, removing all occurrences at once
   **************************************************************/
  public void removeTask(String description) {// receive param
    // create a new list to remove
    List<Tasks> toDoListToRemove = new ArrayList<>();

    // checks all occurrences
    for (Tasks t : task) {
      if (t.getDescription().equalsIgnoreCase(description)) {
        toDoListToRemove.add(t);
      }
    }
    // list of names to be removed at once
    task.removeAll(toDoListToRemove);
  }

  // method that shows the total number of tasks
  public int totalTasks() {
    return task.size();
  }

  // method that shows all tasks
  public void taskAll() {
    int i = 1;
    for (Tasks t : task) {
      String numberTasks = String.format("%d - %s", i, t);
      System.out.println(numberTasks);
      i++;
    }
  }

}
