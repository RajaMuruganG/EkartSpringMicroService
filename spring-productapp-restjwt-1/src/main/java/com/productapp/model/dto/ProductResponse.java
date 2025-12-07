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
public class ProductResponse {

	
	private Integer productId;
	private String productName;
	private double price;
	private FeatureResponse features;
	private List<OfferResponse> offers;
	private BrandResponse brand;
	private List<CategoryResponse> categories;
}
