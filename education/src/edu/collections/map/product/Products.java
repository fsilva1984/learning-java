package edu.collections.map.product;

public class Products {

	private String name;
	private Double price;
	private int amount;
	
	public Products(String name, Double price, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return "Products [ name: " + name + ", price: " + price + ", amount: " + amount + "]\n";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
