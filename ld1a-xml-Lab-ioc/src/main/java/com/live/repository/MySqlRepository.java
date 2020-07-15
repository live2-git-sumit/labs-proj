package com.live.repository;

import java.util.ArrayList;
import java.util.List;

import com.live.model.Product;

public class MySqlRepository implements ProductRepository {
	
	private static MySqlRepository instance = null;
	
	private MySqlRepository() {
		
	}
	
	public static MySqlRepository getInstance() {
		if (instance == null) {
			instance = new MySqlRepository();
		}
		return instance;
	}
	

	@Override
	public List<Product> getProducts() {
		System.out.println("MySQL Repository");
		List<Product> products = new ArrayList<>();

		Product product = new Product();

		product.setProductId("P11");
		product.setProductName("MySQl");

		products.add(product);

		return products;
	}

}
