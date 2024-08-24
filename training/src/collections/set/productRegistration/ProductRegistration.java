package collections.set.productRegistration;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
  private Set<Products> product;

  // constructor
  public ProductRegistration() {
    this.product = new HashSet<>();
  }

  public Set<Products> getProduct() {
    return product;
  }

  // method add products
  public void addProducts(String name, double price, long cod) {
    product.add(new Products(name, 0, cod));
  }

  /***********************************************************************************
   * method returns a set of objects of type Products.
   * here we will create a TreeSet so that the method returns an ordered set,
   * based on the rules of the Products class, which implements the
   * Comparable interface where it will order the products by name
   ************************************************************************************/
  public Set<Products> showProductsSortedByName() {
    Set<Products> productName = new TreeSet<>(product);
    return productName;
  }

  /***********************************************************************************
   * method returns a set of objects of type Products.
   * here we will create a TreeSet so that the method returns an ordered set,
   * based on the rules of the PriceComparison class, which implements the
   * Compator interface where it will order the products by price
   ************************************************************************************/
  public Set<Products> showProductPrices() {
    Set<Products> showPrices = new TreeSet<>(new PriceComparison());
    showPrices.addAll(product);
    return showPrices;
  }
}
