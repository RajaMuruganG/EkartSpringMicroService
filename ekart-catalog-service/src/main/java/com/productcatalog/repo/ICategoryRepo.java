package com.productcatalog.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.productcatalog.model.entities.Category;

public interface ICategoryRepo extends JpaRepository<Category, Integer> {

}
