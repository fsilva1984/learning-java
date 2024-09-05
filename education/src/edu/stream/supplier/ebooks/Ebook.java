package edu.stream.supplier.ebooks;

public class Ebook {
	private String title;
	private String author;
	private long date;
	public Ebook(String title, String author, long date) {
		super();
		this.title = title;
		this.author = author;
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public long getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "Ebook [ Title: " + title + ", Author: " + author + ", Date: " + date + "]";
	}
	
	
}
