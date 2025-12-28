package com.productinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productinfo.feign.IProductCatalogFeignClient;
import com.productinfo.model.Product;
import com.productinfo.service.IProductService;

@Service
public class ProductServiceFeignImpl implements IProductService {

	
	@Autowired
	IProductCatalogFeignClient feignClient; 
	
	@Override
	public Product getProductById(int productId) {
		
		return feignClient.getById(productId).getBody();
	}

	@Override
	public List<Product> getAllProduct() {
		return feignClient.getAll().getBody();
	}

	@Override
	public List<Product> getAllProductByBrand(String brand) {
		return feignClient.getByBrand(brand).getBody();
	}

	@Override
	public List<Product> getAllProductByCategory(String category) {
		return feignClient.getByCategory(category).getBody();
	}

	@Override
	public List<Product> getAllProductByCategoryAndLessPrice(String category, double price) {
		return feignClient.getByCatLessPrice(category, price).getBody();
	}


}
