package com.productcatalog.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productcatalog.model.entities.Brand;

public interface IBrandRepo extends JpaRepository<Brand, Integer> {

}
