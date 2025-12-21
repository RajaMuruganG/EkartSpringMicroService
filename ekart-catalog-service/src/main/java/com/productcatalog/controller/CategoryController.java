package com.productcatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.model.dto.CategoryRequest;
import com.productcatalog.model.dto.CategoryResponse;
import com.productcatalog.service.ICategoryService;

@RestController
@RequestMapping("/catalog-service/v1")
public class CategoryController {
	
	@Autowired
	ICategoryService categoryService;

	@PostMapping("/category")
	ResponseEntity<Void> addCategory(@RequestBody CategoryRequest categoryRequest) {
		
		categoryService.addCategory(categoryRequest);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping("/category")
	ResponseEntity<Void> updateCategory(@RequestBody CategoryRequest categoryRequest) {

		categoryService.updateCategory(categoryRequest);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}

	@DeleteMapping("/category/{categoryId}")
	ResponseEntity<Void> deleteCategory(@PathVariable int categoryId) {

		categoryService.deleteCategory(categoryId);
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	ResponseEntity<CategoryResponse> getById(int categoryId) {
		
		CategoryResponse categoryResponse =  categoryService.getById(categoryId);
		
		return ResponseEntity.ok().body(categoryResponse);
	}
}
