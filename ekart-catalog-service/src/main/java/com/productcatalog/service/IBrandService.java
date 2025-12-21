package com.productcatalog.service;

import com.productcatalog.model.dto.BrandRequest;
import com.productcatalog.model.dto.BrandResponse;

public interface IBrandService {

	//CRUD operation
		void addBrand(BrandRequest brandRequest);
		void updateBrand(BrandRequest brandRequest);
		void deleteBrand(int brandId);
		BrandResponse getById(int brandId) ;
}
