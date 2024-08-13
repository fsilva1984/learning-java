package library;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) {
    // Array of custom class objects with 5 positions
    Books[] books = new Books[5];

    books[0] = new Books("Java - Guia do Programador: Atualizado Para Java 16",
        "Peter Jandl Junior", 2021);
    books[1] = new Books("Desenvolvimento Real de Software: Um guia de projetos para fundamentos em Java",
        "Raoul-Gabriel Urma e  Richard Warburton", 2021);
    books[2] = new Books(
        "Microsserviços Prontos Para a Produção:Construindo Sistemas Padronizados em uma Organização de Engenharia de Software",
        "Susan J. Fowler", 2017);
    books[3] = new Books("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos",
        "Aditya Y. Bhargava", 2017);
    books[4] = new Books("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017);

    System.out.println("\n------------------------------------------------------\n");
    System.out.println("** ORGANIZANDO LIVROS POR TITULO **\n");
    // invocando o método compareTo
    Arrays.sort(books);
    for (Books book : books) {
      String sortingbyTitle = String.format("Titulo: %s\nAutor: %s\nAno de lançamento: %d",
          book.getTitle(), book.getAuthor(), book.getReleases());
      System.out.println(sortingbyTitle + "\n");
    }

    System.out.println("\n------------------------------------------------------\n");
    System.out.println("** ORGANIZANDO LIVROS POR AUTOR **\n");

    Comparator<Books> author = new Author();
    /**************************************************
     * invoking the compare method of the Author class
     * that implements the
     * Comparator interface
     **************************************************/
    Arrays.sort(books, author);
    for (Books book : books) {
      String sortingbyAuthor = String.format("Titulo: %s\nAutor: %s\nAno de lançamento: %d",
          book.getTitle(), book.getAuthor(), book.getReleases());
      System.out.println(sortingbyAuthor + "\n");
    }

    System.out.println("\n------------------------------------------------------\n");
    System.out.println("** ORGANIZANDO LIVROS POR ANO DE LANÇAMENTO **\n");

    Comparator<Books> releases = new Releases();

    /************************************************
     * invoking the compare method of the Releases
     * class that implements the
     * Comparator interface
     ************************************************/
    Arrays.sort(books, releases);
    for (Books book : books) {
      String sortingbyAuthor = String.format("Titulo: %s\nAutor: %s\nAno de lançamento: %d",
          book.getTitle(), book.getAuthor(), book.getReleases());
      System.out.println(sortingbyAuthor + "\n");
    }
  }
}
