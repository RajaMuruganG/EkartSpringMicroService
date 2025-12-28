package com.productinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productinfo.model.Product;
import com.productinfo.service.IProductService;

@RestController
@RequestMapping("/product-info")
public class ProductController {

	@Autowired
	IProductService productService;

	@GetMapping("/productId/{productId}")
	ResponseEntity<Product> getProductById(@PathVariable int productId) {
		Product product = productService.getProductById(productId);
		return ResponseEntity.ok(product);
	}

	ResponseEntity<List<Product>> getAllProduct() {
		return null;
	}

	ResponseEntity<List<Product>> getAllProductByBrand() {
		return null;
	}

	ResponseEntity<List<Product>> getAllProductByCategory() {
		return null;
	}

	ResponseEntity<List<Product>> getAllProductByCategoryAndLessPrice() {
		return null;
	}

}
