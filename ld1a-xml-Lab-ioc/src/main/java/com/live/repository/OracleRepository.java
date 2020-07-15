package com.live.repository;

import java.util.ArrayList;
import java.util.List;

import com.live.model.Product;

public class OracleRepository implements ProductRepository {
	
	private static OracleRepository instance = null;
	private OracleRepository() {
		
	}
	public static OracleRepository getInstance() {
		if (instance == null) {
			instance = new OracleRepository();
		}
		return instance;
	}

	@Override
	public List<Product> getProducts() {
		System.out.println("Oracle Repository");
		List<Product> products = new ArrayList<>();

		Product product = new Product();

		product.setProductId("P01");
		product.setProductName("Oracle");

		products.add(product);

		return products;
	}

}
