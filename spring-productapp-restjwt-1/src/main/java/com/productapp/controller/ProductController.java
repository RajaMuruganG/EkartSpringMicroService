package com.productapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ekart")
public class ProductController {
	

	// http://localhost:8081/greet/priya
	@GetMapping("/product/{productName}")
	public ResponseEntity<String> greetUser(@PathVariable String productName) {
	    String msg = "This product " + productName +" is available now";
	    return ResponseEntity.ok(msg);
	}

}
