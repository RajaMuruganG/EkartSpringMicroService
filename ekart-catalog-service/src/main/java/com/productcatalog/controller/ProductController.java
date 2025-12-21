package com.productcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.model.dto.ProductRequest;
import com.productcatalog.model.dto.ProductResponse;
import com.productcatalog.service.IProductService;

@RestController
@RequestMapping("/catalog-service/v1")
public class ProductController {

	@Autowired
	IProductService productService;

	@PostMapping("/products")
	ResponseEntity<Void> addProduct(@RequestBody ProductRequest productRequest) {
		System.out.println("productRequest"+ productRequest);
		productService.addProduct(productRequest);

		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping("/products")
	ResponseEntity<Void> updateProduct(@RequestBody ProductRequest productRequest) {

		productService.updateProduct(productRequest);

		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}

	@DeleteMapping("/products/productId/{productId}")
	ResponseEntity<Void> deleteProduct(@PathVariable int productId) {

		productService.deleteProduct(productId);

		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@GetMapping("/products/productId/{productId}")
	ResponseEntity<ProductResponse> getById(@PathVariable int productId) {

		ProductResponse product = productService.getById(productId);

		return ResponseEntity.ok().body(product);
	}

	@GetMapping("/products")
	ResponseEntity<List<ProductResponse>> getAll() {
		List<ProductResponse> products = productService.getAll();

		return ResponseEntity.ok().body(products);
	}

//	 http://localhost:8081/catalog-service/v1/products/brand/Samsung
	@GetMapping("/products/brand/{brand}")
	ResponseEntity<List<ProductResponse>> getByBrand(@PathVariable String brand) {
		List<ProductResponse> products = productService.getByBrand(brand);
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "getting all products by brand");
		return new ResponseEntity<List<ProductResponse>>(products, headers, HttpStatus.OK.value());
	}

//	 http://localhost:8081/catalog-service/v1/products/category?category=electronics
	@GetMapping("/products/category")
	ResponseEntity<List<ProductResponse>> getByCategory(@RequestParam String category) {
		List<ProductResponse> products = productService.getByCategory(category);
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "getting all products by category");
		return ResponseEntity.ok().headers(headers).body(products);
	}

//	http://localhost:8081/catalog-service/v1/products/category/Electronics/price/20000
	@GetMapping("/products/category/{category}/price/{price}")
	ResponseEntity<List<ProductResponse>> getByCatLessPrice(@PathVariable String category, @PathVariable double price) {
		List<ProductResponse> products = productService.getByCatLessPrice(category, price);
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "getting all products by category and less price");
		return ResponseEntity.ok().headers(headers).body(products);
	}
}
