package collections.list.search;

import java.util.ArrayList;
import java.util.List;

public class ToLookFor {

  private List<BookCatalog> bookCatalog;

  // method contructor
  public ToLookFor() {
    this.bookCatalog = new ArrayList<>();
  }

  /*********************************************************************
   * This method invokes the 'add' method of the generic object class, which
   * receives as a parameter the constructor of the 'BookCatalog' class, which
   * already initializes an empty list.
   **********************************************************************/
  public void addBook(String title, String author, int age) {
    bookCatalog.add(new BookCatalog(title, author, age));
  }

  /************************************************************************
   * This method starts by creating a generic list of objects. It then iterates
   * over the 'bookCatalog' list to check if it is not empty. Finally, the method
   * iterates through the entire 'bookCatalog' list in search of an object that
   * matches the given parameter. Each time a match is found, the object is added
   * to the new generic list.
   ***************************************************************************/
  public List<BookCatalog> searToAuthor(String description) {
    List<BookCatalog> bookAuthor = new ArrayList<>();

    if (!bookCatalog.isEmpty()) {
      for (BookCatalog author : bookCatalog) {
        if (author.getAuthor().equalsIgnoreCase(description)) {
          bookAuthor.add(author);
        }
      }
    }

    return bookAuthor;
  }

  public List<BookCatalog> releaseTrack(int startOfBreak, int endOfBreak) {
    List<BookCatalog> bookRelease = new ArrayList<>();

    if (!bookCatalog.isEmpty()) {
      for (BookCatalog book : bookCatalog) {
        if (book.getAge() >= startOfBreak && book.getAge() <= startOfBreak) {
          bookRelease.add(book);
        }
      }
    }

    return bookRelease;
  }

  public BookCatalog searchByTitle(String description) {
    BookCatalog bookTitle = null;
    if (!bookCatalog.isEmpty()) {
      for (BookCatalog book : bookCatalog) {
        if (book.getTitle().equalsIgnoreCase(description)) {
          bookTitle = book;
        }
      }
    }
    return bookTitle;
  }

  public List<BookCatalog> removeBook(String description) {
    List<BookCatalog> booksToRemove = new ArrayList<>();

    if (bookCatalog.isEmpty()) {
      for (BookCatalog book : bookCatalog) {
        if (book.getTitle().equalsIgnoreCase(description)) {
          booksToRemove.add(book);
        }
      }
    }

    bookCatalog.removeAll(booksToRemove);
    return booksToRemove;
  }

  public void printAllBooks() {
    for (BookCatalog book : bookCatalog) {
      System.out.println(book);
    }
  }

  public int amountOfbooks() {
    return bookCatalog.size();
  }

}
