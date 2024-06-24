package com.example.ProductandServies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements iProductService
{
	public List<Product>findAll(){
		ArrayList<Product>products=new ArrayList<>();
		products.add(new Product(1001,"POCO moblie","MB1001",10000.00,5));
		products.add(new Product(1002,"VIVO moblie","MB1002",20000.00,8));
		products.add(new Product(1003,"OPPO moblie","MB1003",25000.00,4));
		return products;
	}
}
