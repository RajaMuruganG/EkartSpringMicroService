package com.productapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productapp.model.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> {

}
