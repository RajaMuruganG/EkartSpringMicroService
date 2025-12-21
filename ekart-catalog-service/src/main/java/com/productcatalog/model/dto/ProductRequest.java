package com.productcatalog.model.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.SequenceGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
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
	private String description;
	private FeaturesRequest features;
	private List<OffersRequest> offers;
	private BrandRequest brand;
	private List<CategoryRequest> categories;
	private List<String> paymentModes; //COD,UPI,CREDITCARD,DEBITCARD
	private List<String> deliveryTypes; //standard, prime,free
	
}
