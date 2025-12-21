package com.productcatalog.util;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.productcatalog.model.dto.BrandRequest;
import com.productcatalog.model.dto.BrandResponse;
import com.productcatalog.model.dto.CategoryRequest;
import com.productcatalog.model.dto.CategoryResponse;
import com.productcatalog.model.dto.ProductRequest;
import com.productcatalog.model.dto.ProductResponse;
import com.productcatalog.model.entities.Brand;
import com.productcatalog.model.entities.Category;
import com.productcatalog.model.entities.Product;

@Component
public class ProductMapper {

	@Autowired
	private ModelMapper mapper;

	// entity to response
	public ProductResponse toProductResponse(Product product) {
		return mapper.map(product, ProductResponse.class);
	}

	public CategoryResponse toCategoryResponse(Category category) {
		return mapper.map(category, CategoryResponse.class);
	}

	public BrandResponse toBrand(Brand brand) {
		return mapper.map(brand, BrandResponse.class);
	}

	// request to entity
	public Product toProductEntity(ProductRequest productRequest) {
		return mapper.map(productRequest, Product.class);
	}

	public Category toCategoryEntity(CategoryRequest categoryRequest) {
		return mapper.map(categoryRequest, Category.class);
	}

	public Brand toBrandEntity(BrandRequest brandRequest) {
		return mapper.map(brandRequest, Brand.class);
	}
}
