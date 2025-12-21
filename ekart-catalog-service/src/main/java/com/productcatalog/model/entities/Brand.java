package com.productcatalog.model.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "products")
@Entity
public class Brand {
	
	@Id
	@SequenceGenerator(name = "brand_gen", sequenceName = "brand_seq", allocationSize = 100, initialValue = 100)
	@GeneratedValue(generator = "brand_gen", strategy = GenerationType.AUTO)
	private Integer brandId;
	private String brandName;
	
	@OneToMany(mappedBy = "brand")
	private List<Product> products;
}
