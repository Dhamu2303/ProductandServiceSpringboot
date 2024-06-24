package com.example.ProductandServies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	private iProductService productService;
	@GetMapping(value = "/product")
	public List<Product>getProducts(){
		List<Product>products=productService.findAll();
		return products;
	}
}
