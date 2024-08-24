package collections.set.productRegistration;

public class Products implements Comparable<Products> {
  private String name;
  private double price;
  private long cod;

  public Products(String name, int price, long cod) {
    this.name = name;
    this.price = price;
    this.cod = cod;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public long getCod() {
    return cod;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (cod ^ (cod >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Products other = (Products) obj;
    if (cod != other.cod)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Products name: " + name + ", price: " + price + ", cod: " + cod + "\n";
  }

  @Override
  public int compareTo(Products o) {
    return name.compareToIgnoreCase(o.getName());
  }


  
}
