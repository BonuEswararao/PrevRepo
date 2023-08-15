package com.yrrhelp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yrrhelp.models.Product;
import com.yrrhelp.services.ProductService;

@RestController
public class ProductRestController {
	
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
		
	}

}
