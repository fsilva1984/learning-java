package edu.collections.set.treeSet;

import java.util.Objects;

public class Products implements Comparable<Products> {

private String name;
private int amount;
private double price;
private long cod;

	public Products(String name, int amount, double price, long cod) {
	super();
	this.name = name;
	this.amount = amount;
	this.price = price;
	this.cod = cod;
}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}

	public double getPrice() {
		return price;
	}

	public long getCod() {
		return cod;
	}

	@Override
	public int compareTo(Products o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
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
		return cod == other.cod;
	}

	
	
}
