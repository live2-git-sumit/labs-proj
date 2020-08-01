package com.live.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.live.model.Product;
import com.live.model.ProductMapper;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	JdbcTemplate jdbcTemplate;
	private final String CREATE_PRODUCT = "INSERT INTO PRODUCTS VALUES (?,?,?)";
	private final String UPDATE_PRODUCT = "UPDATE PRODUCTS SET PRODUCT_NAME=? ,PRODUCT_PRICE=? WHERE PRODUCT_ID = ?";
	private final String DELETE_PRODUCT = "DELETE FROM PRODUCTS WHERE PRODUCT_ID = ?";
	private final String SELECT_PRODUCTS = "SELECT * FROM PRODUCTS";
	private final String SELECT_PRODUCT_BY_ID= "SELECT * FROM PRODUCTS WHERE PRODUCT_ID = ?";
	
	@Autowired
	ProductRepositoryImpl(DataSource dataSource){
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Product> getProducts() {
		ProductMapper productMapper = new ProductMapper();
		List<Product> products = jdbcTemplate.query(SELECT_PRODUCTS,productMapper);
		return products;
	}

	@Override
	public Product getProductById(int productId) {
		ProductMapper productMapper = new ProductMapper();
		Product product = jdbcTemplate.queryForObject(SELECT_PRODUCT_BY_ID, productMapper, productId);
				//queryForObject(SELECT_PRODUCT_BY_ID, 101, productMapper);
		return product;
	}

	@Override
	public boolean createProduct(int productId, String productName,float price) {
		jdbcTemplate.update(CREATE_PRODUCT,productId, productName, price);
	//	jdbcTemplate.update(CREATE_PRODUCT,productId, productName, price);
		return true;
	}

	@Override
	public boolean updateProduct(int productId, String productName,float price) {
		jdbcTemplate.update(UPDATE_PRODUCT,productName, price, productId);
		return true;
	}

	@Override
	public boolean deleteProduct(int productId) {
		jdbcTemplate.update(DELETE_PRODUCT,productId);
		return true;
	}

	@Override
	public boolean createProduct() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Product getProductById(int productId, String productName, float price) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
