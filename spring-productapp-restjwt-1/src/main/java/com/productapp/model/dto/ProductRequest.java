package com.productapp.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductRequest {

	
	private Integer productId;
	private String productName;
	private double price;
	private FeatureRequest features;
	private List<OfferRequest> offers;
	private BrandRequest brand;
	private List<CategoryRequest> categories;
}
