package com.productcatalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalog.exception.BrandNotFoundException;
import com.productcatalog.model.dto.BrandRequest;
import com.productcatalog.model.dto.BrandResponse;
import com.productcatalog.model.entities.Brand;
import com.productcatalog.repo.IBrandRepo;
import com.productcatalog.util.ProductMapper;

@Service
public class BrandServiceImpl implements IBrandService {

	@Autowired
	private IBrandRepo brandRepository;

	@Autowired
	private ProductMapper mapper;

	@Override
	public void addBrand(BrandRequest brandRequest) {
		brandRepository.save(mapper.toBrandEntity(brandRequest));

	}

	@Override
	public void updateBrand(BrandRequest brandRequest) {
		brandRepository.save(mapper.toBrandEntity(brandRequest));
	}

	@Override
	public void deleteBrand(int brandId) {
		brandRepository.deleteById(brandId);
	}

	@Override
	public BrandResponse getById(int brandId) {
		Brand brand = brandRepository.findById(brandId).orElseThrow(() -> new BrandNotFoundException());
		return mapper.toBrand(brand);
	}

}
