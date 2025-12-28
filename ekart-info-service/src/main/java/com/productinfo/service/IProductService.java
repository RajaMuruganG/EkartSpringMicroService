package com.productinfo.service;

import java.util.List;

import com.productinfo.model.Product;

public interface IProductService {

	Product getProductById(int productId);
	List<Product> getAllProduct();
	List<Product> getAllProductByBrand(String brand);
	List<Product> getAllProductByCategory(String category);
	List<Product> getAllProductByCategoryAndLessPrice(String category, double price);
	
}
