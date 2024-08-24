package edu.collections.list.toDoList;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	// private property
	private List<Tasks> todoList;

	// constructor
	public ToDoList() {
		super();
		this.todoList = new ArrayList<>();;
	}

	// add tasks
	public String addToDo(String description) {
		todoList.add(new Tasks(description));
		String resume = String.format("Total de %d tarefas ", numberOfTasks());
		return resume;
	}
	
	// see tasks
	public List<Tasks> seeTasks() {
		return todoList;
	}
	
	// number of tasks added
	public int numberOfTasks() {
		return todoList.size();
	}
	
	// remove task
	public List<Tasks> removeTask(String description) {
		List<Tasks> removeTask  = new ArrayList<>();
		if (!todoList.isEmpty()) {
			for (Tasks task : todoList) {
				if (task.getDesciptio().equalsIgnoreCase(description)) {
					removeTask.add(task);
				}
			}
		}
		
		todoList.removeAll(removeTask);
		return removeTask;
	}
}
