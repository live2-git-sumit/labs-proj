package com.live.repository;

import java.util.List;

import com.live.model.Product;

public interface ProductRepository {
public boolean createProduct();
public boolean updateProduct(int productId, String productName,float price);
public boolean deleteProduct(int productId);
public List<Product> getProducts();
//public Product getProductById();
public Product getProductById(int productId, String productName,float price);
boolean createProduct(int productId, String productName,float price);
Product getProductById(int productId);

}
