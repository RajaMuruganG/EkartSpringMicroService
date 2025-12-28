package com.productinfo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.productinfo.model.Product;


@FeignClient(name = "product-catalog")
public interface IProductCatalogFeignClient {

	@GetMapping("/catalog-service/v1/products/productId/{productId}")
	ResponseEntity<Product> getById(@PathVariable int productId) ;
	
	@GetMapping("/catalog-service/v1/products")
	ResponseEntity<List<Product>> getAll();
	
	@GetMapping("/catalog-service/v1/products/brand/{brand}")
	ResponseEntity<List<Product>> getByBrand(@PathVariable String brand);

	@GetMapping("/catalog-service/v1/products/category")
	ResponseEntity<List<Product>> getByCategory(@RequestParam String category);

	@GetMapping("/catalog-service/v1/products/category/{category}/price/{price}")
	ResponseEntity<List<Product>> getByCatLessPrice(@PathVariable String category, @PathVariable double price);

}
