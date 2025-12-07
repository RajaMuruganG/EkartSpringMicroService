package com.productapp.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@ToString
@Entity
public class Category {

	@Id
	@SequenceGenerator(name = "category_gen", sequenceName = "category_seq",allocationSize = 10, initialValue = 10)
	@GeneratedValue(generator = "category_gen", strategy = GenerationType.AUTO)
	private Integer categoryId;
	
	private String categoryName;
	
}
