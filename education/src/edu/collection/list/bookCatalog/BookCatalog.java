package edu.collection.list.bookCatalog;

import java.util.List;
import java.util.ArrayList;

public class BookCatalog {
	private List<Book> bookCatalog;

	/*
	 *  constructor class with an empty list 
	 * */
	public BookCatalog() {
	this.bookCatalog = new ArrayList<>();
	}

	// add new book
	public void addBook(String title, String author, int age) {
		bookCatalog.add(new Book(title, author, age));
	}
	
	// show all  books
	public void printAllBook() {
		for (Book book : bookCatalog) {
			System.out.println(book);
		}
	}
	
	// show number of books
		public int amountOfbooks() {
			return bookCatalog.size();
		}

	/*
	 * remove all occurrences of the book described
	 * */
	public List<Book> removeBook(String description) {
		List<Book> bookToRemove = new ArrayList<>();
		if (!bookCatalog.isEmpty()) {
			for (Book book : bookCatalog) {
				if (book.getTitle().equalsIgnoreCase(description) ||
						book.getAuthor().equalsIgnoreCase(description)) {
					bookToRemove.add(book);
				}
			}
		}
		bookCatalog.removeAll(bookToRemove);
		return bookToRemove;
	}
	
	// search by title or author
	public List<Book> searchByTitle(String description) {
		List<Book> occurrences = new ArrayList<>();
		if (!bookCatalog.isEmpty()) {
			for (Book book : bookCatalog) {
				if (book.getTitle().equalsIgnoreCase(description) ||
						book.getAuthor().equalsIgnoreCase(description)) {
					occurrences.add(book);
				}
			}
		}
		return occurrences;
	}
	
	// search by release year
	public List<Book> searchByRelease(int start, int end) {
		List<Book> occurrences = new ArrayList<>();
		if (!bookCatalog.isEmpty()) {
			for (Book book : bookCatalog) {
				if (start <= book.getAge() && end >= book.getAge()) {
					occurrences.add(book);
				}
			}
		}
		return occurrences;
	}
	
	
	
	
}
