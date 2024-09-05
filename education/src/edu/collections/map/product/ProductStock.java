package edu.collections.map.product;

import java.util.HashMap;
import java.util.Map;

public class ProductStock {
	/*********************************************************************
	 * The private property implements a Map that receives a Long
	 * type as key and an object of type Product as value
	 * *********************************************************************/
	private Map<Long, Products> product;

	// The class constructor method that initializes an empty Map
	public ProductStock() {
		super();
		this.product = new HashMap<>();
	}
	
	/************************************************************************
	 * The addProduct method adds objects of the Products class with
	 * their respective keys to the Map structure using the put method.
	 * ***********************************************************************/
	public void addProduct(long cod, String name, double price, int amount) {
		product.put(cod, new Products(name, price, amount));
		
	}

	/*************************************************************************************************
	 *The `totalStockValue` method, which returns a value of type `double`,
	 *aims to calculate the total value of the products in stock and display the result.
	 *The method follows these steps:
	 * 1. Checks if the data structure is not empty.
	 * 2. If the structure is not empty, a `for` loop is used to iterate over the objects present.
	 * 3. In each iteration, a variable of type `double` is updated with the multiplication of the
	 * `getAmount` and `getPrice` properties of each object.
	 * The method then calculates and returns the total value of the stock.
	 **************************************************************************************************** */
	public double totalStockValue() {
		double totalValue = 0d;
		if (!product.isEmpty()) {
			for (Products p : product.values()) {
				totalValue += p.getAmount() * p.getPrice();
			}
		}
		return totalValue;
		
	}
	
	
	// calculate the total value of the product
	public double calculateTheTotalValue(long cod) {
		double totalValue = 0d;
		totalValue = product.get(cod).getPrice() * product.get(cod).getAmount();
		return totalValue;
		
	}
	
	
	
}








