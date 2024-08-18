package edu.collection.list.bookCatalog;

public class Main {
	public static void main(String[] args) {
	BookCatalog book = new BookCatalog();
	
	book.addBook("Java Learning 2", "Silva", 1999);
    book.addBook("Java Learning", "Silva", 1991);
    book.addBook("Javascript for beginners", "FF Silva", 2018);
    book.addBook("Python for everyone", "Mark Thompson", 2012);
    book.addBook("Javascript Css end HTML5", "FF Silva", 2010);
    book.addBook("Java or Kotlin to day?", "Marcos Mangara", 2020);
    
    System.out.println(
            "\n------ Quantidade de livros na biblioteca ----------\n");
    System.out.println("Existem: "+book.amountOfbooks()+ " livros na biblioteca");

    System.out.println(
            "\n------ Buscando Livros pelo titulo ou autor ------------------\n");
    System.out.println(book.searchByTitle("FF Silva"));
    
    System.out.println(
            "\n------ Buscando livros por ano de lançamento -------\n");
    System.out.println(book.searchByRelease(1993, 2018));

    System.out.println(
            "\n------ Livros excluidos ----------------------------\n");
    System.out.println(book.removeBook("Javascript Css end HTML5"));

    System.out.println(
            "\n------ Quantidade de livros na biblioteca ----------\n");
    System.out.println("Existem: " +book.amountOfbooks()+ " livros na biblioteca");

	}
}
