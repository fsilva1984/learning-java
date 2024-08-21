package edu.collection.list.toDoList;

public class Tasks {
	private String desciptio;

	public Tasks(String desciptio) {
		super();
		this.desciptio = desciptio;
	}

	public String getDesciptio() {
		return desciptio;
	}

	@Override
	public String toString() {
		return "To Do: Desciptio: " + desciptio;
	}
	
	
}
