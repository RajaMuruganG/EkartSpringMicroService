package com.productcatalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalog.model.dto.CategoryRequest;
import com.productcatalog.model.dto.CategoryResponse;
import com.productcatalog.model.entities.Category;
import com.productcatalog.repo.ICategoryRepo;
import com.productcatalog.util.ProductMapper;

@Service
public class CategoryImpl implements ICategoryService {

	@Autowired
	ProductMapper mapper;

	@Autowired
	ICategoryRepo categoryRepo;

	@Override
	public void addCategory(CategoryRequest categoryRequest) {
		categoryRepo.save(mapper.toCategoryEntity(categoryRequest));
	}

	@Override
	public void updateCategory(CategoryRequest categoryRequest) {
		categoryRepo.save(mapper.toCategoryEntity(categoryRequest));
	}

	@Override
	public void deleteCategory(int categoryId) {
		categoryRepo.deleteById(categoryId);
	}

	@Override
	public CategoryResponse getById(int categoryId) {

		Category category = categoryRepo.findById(categoryId)
				.orElseThrow(() -> new RuntimeException("invalid category"));
		return mapper.toCategoryResponse(category);

	}

}
