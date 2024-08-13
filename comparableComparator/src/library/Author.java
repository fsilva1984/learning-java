package library;

import java.util.Comparator;

public class Author implements Comparator<Books> {

  /***************************************
   * This implementation of the Comparator
   * interface sorts books by author.
   ************************************/

  @Override
  public int compare(Books b1, Books b2) {
    return b1.getAuthor().compareTo(b2.getAuthor());
  }
}
