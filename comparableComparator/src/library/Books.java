package library;

public class Books implements Comparable<Books> {

  /****************************************
   * This implementation of the Comparable
   * interface sorts books by title.
   ***************************************/

  private String title;
  private String author;
  private int releases;

  public Books(String title, String author, int releases) {
    this.author = author;
    this.releases = releases;
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getReleases() {
    return releases;
  }

  @Override
  public int compareTo(Books other) {
    return title.compareTo(other.title);
  }
}
