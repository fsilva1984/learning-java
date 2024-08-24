package collections.set.productRegistration;

public class Main {
  public static void main(String[] args) {
    
    ProductRegistration products = new ProductRegistration();

    products.addProducts("Desodorante AXE", 8.75,  92173475689377L);
    products.addProducts("Desodorante NIVEA", 12.45, 92173475349377L);
    
    System.out.println(products.showProductsSortedByName());

    System.out.println(products.showProductPrices());

    System.out.println();
  }

}
