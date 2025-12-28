package com.productinfo.controller;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productinfo.model.Product;
import com.productinfo.service.IProductService;

@RestController
@RequestMapping("/info-service/v1")
public class ProductController {

	@Autowired
	private IProductService productService;

	@GetMapping("/product-info/{productId}")
	ResponseEntity<Product> getProductById(@PathVariable int productId) {
		Product product = productService.getProductById(productId);
		return ResponseEntity.ok(product);
	}

	@GetMapping("/product-info/getAll")
	ResponseEntity<List<Product>> getAllProduct() {
		List<Product> products = productService.getAllProduct();
		return ResponseEntity.ok(products);
	}

	@GetMapping("/product-info/brand/{brand}")
	ResponseEntity<List<Product>> getAllProductByBrand(@PathVariable String brand) {
		List<Product> products = productService.getAllProductByBrand(brand);
		return ResponseEntity.ok(products);
	}

	@GetMapping("/product-info/category/{category}")
	ResponseEntity<List<Product>> getAllProductByCategory(@PathVariable String category) {
		List<Product> products = productService.getAllProductByCategory(category);
		return ResponseEntity.ok(products);
	}

	@GetMapping("/product-info/category/{category}/price/{price}")
	ResponseEntity<List<Product>> getAllProductByCategoryAndLessPrice(@PathVariable String category,
			@PathVariable double price) {
		List<Product> products = productService.getAllProductByCategoryAndLessPrice(category, price);
		return ResponseEntity.ok(products);
	}

}
