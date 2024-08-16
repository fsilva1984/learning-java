package collections.list.search;

public class Main {
    public static void main(String[] args) {
        ToLookFor book = new ToLookFor();

        book.addBook("Java Learning 2", "Silva", 1999);
        book.addBook("Java Learning", "Silva", 1991);
        book.addBook("Javascript for beginners", "FF Silva", 2018);
        book.addBook("Python for everyone", "Mark Thompson", 2012);
        book.addBook("Javascript Css end HTML5", "FF Silva", 2010);
        book.addBook("Java or Kotlin to day?", "Marcos Mangara", 2020);

        System.out.println(
                "\n------ Quantidade de livros na biblioteca ----------\n");

        String numberOfBooks = String.format("Numero total de livros: %d",
                book.amountOfbooks());
        System.out.println(numberOfBooks);

        System.out.println(
                "\n------ Buscando Livros pelo autor ------------------\n");
        System.out.println(book.searToAuthor("Silva"));

        System.out.println(
                "\n------ Buscando livros por ano de lançamento -------\n");
        System.out.println(book.releaseTrack(1992, 2019));

        book.removeBook("Javascript Css end HTML5");

        System.out.println(
                "\n------ Buscando livro por titulo -------------------\n");
        System.out.println(book.searchByTitle("Javascript for beginners"));

        System.out.println(
                "\n----------------------------------------------------\n");
        System.out.println(numberOfBooks + "\n");

        book.printAllBooks();

    }
}
