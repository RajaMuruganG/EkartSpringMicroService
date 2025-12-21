package com.productcatalog.model.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Category {
	@Id
	@SequenceGenerator(name = "category_gen", sequenceName = "category_seq", allocationSize = 1000, initialValue = 1)
	@GeneratedValue(generator = "category_gen", strategy = GenerationType.AUTO)
	private Integer categoryId;
	private String category;
	@ManyToMany(mappedBy = "categories") //to avoid another junction table
	private List<Product> products;
}
