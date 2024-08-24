package collections.set.productRegistration;

import java.util.Comparator;

public class PriceComparison implements Comparator<Products> {

  @Override
  public int compare(Products p1, Products p2) {
    return Double.compare(p1.getPrice(), p2.getPrice());
  }

}
