package collections.list.toDoList;

public class Main {
  public static void main(String[] args) {
    ToDoList toDoList = new ToDoList();

    toDoList.addTasks("Jogar o lixo");
    toDoList.addTasks("JOGAR O LIXO");
    toDoList.addTasks("viajar");
    toDoList.addTasks("Terminar o exercicio");

    System.out.println(
        "\n--------------------------------------\n");
        
    System.out.println("Numero de tarefas: " + toDoList.totalTasks());
    toDoList.taskAll();

    System.out.println(
        "\n--------------------------------------\n");

    toDoList.removeTask("jogar o lixo");

    System.out.println("Numero de tarefas: " + toDoList.totalTasks());
    toDoList.taskAll();
  }

}
