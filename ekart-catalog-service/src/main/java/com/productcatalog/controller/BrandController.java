package com.productcatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.model.dto.BrandRequest;
import com.productcatalog.model.dto.BrandResponse;
import com.productcatalog.service.IBrandService;

@RestController
@RequestMapping("/catalog-service/v1")
public class BrandController {

	
	@Autowired
	IBrandService brandService;
	
	
	@GetMapping("/greet")
	public String greeting() {
		return "Welcome to java world";
	}
	
	@PostMapping("/brand")
	ResponseEntity<Void> addBrand(@RequestBody BrandRequest brandRequest) {
		System.out.println(brandRequest);
		brandService.addBrand(brandRequest);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping("/brand")
	ResponseEntity<Void> updateBrand(@RequestBody BrandRequest brandRequest) {

		brandService.updateBrand(brandRequest);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		
	}

	@DeleteMapping("/deleteBrand/{brandId}")
	ResponseEntity<Void> deleteBrand(@PathVariable int brandId) {

		brandService.deleteBrand(brandId);
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@GetMapping("/getBrand/{brandId}")
	ResponseEntity<BrandResponse> getById(@PathVariable int brandId) {
		
		BrandResponse brandResponse= brandService.getById(brandId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "getting one brand by id");
		
		return ResponseEntity.ok()
				.headers(headers)
				.body(brandResponse);
	}

}
