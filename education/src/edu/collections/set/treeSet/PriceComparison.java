package edu.collections.set.treeSet;

import java.util.Comparator;

public class PriceComparison implements Comparator<Products> {

	@Override
	public int compare(Products o1, Products o2) {
		return Double.compare(o1.getPrice(), o2.getPrice());
	}

}
