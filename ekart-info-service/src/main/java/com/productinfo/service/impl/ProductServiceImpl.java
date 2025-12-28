package com.productinfo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.productinfo.model.Product;
import com.productinfo.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	final String BASE_URL = "http://product-catalog/catalog-service/v1/products";

	RestClient restClient;

	public ProductServiceImpl(RestClient.Builder restClient) {
		this.restClient = restClient.build(); //returns a restclient object
	}

	@Override
	public Product getProductById(int productId) {
		return restClient.get()
				.uri(BASE_URL + "productId/{productId}", productId)
				.retrieve()
				.body(Product.class);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProductByBrand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProductByCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProductByCategoryAndLessPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}
