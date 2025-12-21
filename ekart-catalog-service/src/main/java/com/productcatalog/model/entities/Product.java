package com.productcatalog.model.entities;

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
@Entity
public class Product {

	@Id
	@SequenceGenerator(name = "product_gen", sequenceName = "product_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "product_gen", strategy = GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private double price;
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "feature_id")
	private Features features;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private List<Offers> offers;
	
	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	@ManyToMany
	@JoinTable(name = "product_category",
	joinColumns = @JoinColumn(name ="product_id"),
	inverseJoinColumns = @JoinColumn(name="category_id"))
	private List<Category> categories;
	
	@ElementCollection
	@CollectionTable(name = "payment",joinColumns = @JoinColumn(name="product_id"))
	private List<String> paymentModes; //COD,UPI,CREDITCARD,DEBITCARD
	
	@ElementCollection
	@CollectionTable(name = "delivery",joinColumns = @JoinColumn(name="product_id"))
	private List<String> deliveryTypes; //standard, prime,free
	
}
