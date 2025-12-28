package com.productinfo.service;

import java.util.List;

import com.productinfo.model.Product;

public interface IProductService {

	Product getProductById(int productId);
	List<Product> getAllProduct();
	List<Product> getAllProductByBrand();
	List<Product> getAllProductByCategory();
	List<Product> getAllProductByCategoryAndLessPrice();
	
}
