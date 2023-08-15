package com.yrrhelp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.yrrhelp.models.Product;

public class ProductService {
	
	public List<Product> getAllProducts(){
		
		List<Product> listOfProducts = new ArrayList<>();
		listOfProducts.add(new Product("123","IPHONE X","This is awesome iphone",200.4,"Apple"));
		listOfProducts.add(new Product("124","IPHONE 8","This is awesome iphone",200.8,"Apple"));
		return listOfProducts;
		
		}
	public Product getProductById(String id) {
		Predicate<Product> byId= p ->p.getId().equals(id);
		return filterProducts(byId);
		
	}
	private Product filterProducts(Predicate<Product> strategy) {
		// TODO Auto-generated method stub
		return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
		
	}
	
	public Product addProduct(Product newProduct) {
		newProduct.setId("126");
		return newProduct;
		
	}

}
