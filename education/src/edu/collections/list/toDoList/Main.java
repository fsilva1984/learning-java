package edu.collections.list.toDoList;

public class Main {
	public static void main(String[] args) {
		
		ToDoList todo = new ToDoList();

		todo.addToDo("Jogar o lixo");
		todo.addToDo("Terminar o projeto  X");
		todo.addToDo("Arrumar o quarto");
		todo.addToDo("Beber bastante agua");
		todo.addToDo("Sair com o cachorro");
		todo.addToDo("Fazer exercicicos");
		todo.addToDo("Dormir 8 horas");
		todo.addToDo("Combinar um almoço com Juli");
		
		System.out.println("Resumo de: "+todo.numberOfTasks()+" tarefas");
		
		System.out.println(todo.addToDo("Viajar nas ferias"));

		System.out.println(todo.removeTask("Jogar o lixo")+" Foi removido");
	}
}
 