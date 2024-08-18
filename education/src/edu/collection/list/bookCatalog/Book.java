package edu.collection.list.bookCatalog;

public class Book {
	private String title;
	private String author;
	private int age;
	
	public Book(String title, String author, int age) {
		this.title = title;
		this.author = author;
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		String representation = String.format("Titulo: %s, Autor: %s, Lançado: %d", title, author, age);
		return representation;
	}
	
}
