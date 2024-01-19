package com.Testing.JUnitTesting.Model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private double price;
	List<Product>products=new ArrayList();;
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		
		
	}
	public Product () {
		
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	public List<Product> addProduct(String name,double price ) {
		products.add(new Product(name, price));
		return products;
	}
	

}
