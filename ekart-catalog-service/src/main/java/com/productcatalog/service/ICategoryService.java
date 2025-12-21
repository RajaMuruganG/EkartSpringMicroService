package com.productcatalog.service;

import com.productcatalog.model.dto.CategoryRequest;
import com.productcatalog.model.dto.CategoryResponse;

public interface ICategoryService {

	//CRUD operation
	void addCategory(CategoryRequest categoryRequest);
	void updateCategory(CategoryRequest categoryRequest);
	void deleteCategory(int categoryId);
	CategoryResponse getById(int categoryId) ;
}
