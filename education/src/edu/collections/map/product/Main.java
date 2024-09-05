package edu.collections.map.product;

public class Main {

	public static void main(String[] args) {
		ProductStock product = new ProductStock();
		
		product.addProduct(1L,"Desodorante AXE", 8.90, 6);
		product.addProduct(2L,"Desodorante NIVEA", 10.85, 12);
		product.addProduct(3L,"Sabonete DOVE", 2.90, 50);
		product.addProduct(4L,"Sabonete LUXLUXO", 1.75, 50);
		product.addProduct(5L,"Shampo PALMOLIVE", 12.50, 25);
		product.addProduct(6L,"Shampo SEDA", 18.30, 25);
		
		System.out.println("Valor total de todo o estoque\n"
				+product.totalStockValue());
		
		System.out.println("Valor total de apenas um produto segundo a sua quantidade:\n"
				+product.calculateTheTotalValue(1L));
		
	}
}
