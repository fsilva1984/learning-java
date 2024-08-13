package library;

import java.util.Comparator;

public class Releases implements Comparator<Books> {

  /****************************************
   * This implementation of the Comparator
   * interface sorts books by release year.
   **************************************/

  @Override
  public int compare(Books b1, Books b2) {
    return Integer.compare(b1.getReleases(), b2.getReleases());
  }
}
