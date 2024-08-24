package edu.collections.set.treeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class ProductRegistration {
	
	// private property
	private Set<Products> product;
	
	// constructor method
	public ProductRegistration() {
		super();
		this.product = new HashSet<>();
	}
	
	// getter
	public Set<Products> getProduct() {
		return product;
	}
	
	// method add products on set
	public void addProducts(String name, int amount, double price, long cod) {
		product.add(new Products(name, amount, price, cod));
	}

	// remove product
	public Products removeProduct(long cod) {
		Products productToRemove = null;
		for (Products p : product) {
			if (p.getCod() == cod) {
				productToRemove = p;
				break;
			}
			product.remove(productToRemove);
			return productToRemove;
		}
		return productToRemove;
	}
	
	// products sorted by name
	public Set<Products> productSortedByName() {
		Set<Products> sortedByName = new TreeSet<>(product);
		return sortedByName;
	}

	// sorted by price
	public Set<Products> productsSortedByPrice() {
		Set<Products> sortedByPrice = new TreeSet<>(product);
		sortedByPrice.addAll(product);
		return sortedByPrice;
	}

}
