package collections.list.search;

public class BookCatalog {
  private String title;
  private String author;
  private int age;

  public BookCatalog(String title, String author, int age) {
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
    return "Titulo: " + title + ", Autor: " +
        author + ", Ano de lançamento: " + age;
  }

}
