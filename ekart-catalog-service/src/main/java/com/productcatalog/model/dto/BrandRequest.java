package com.productcatalog.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.productcatalog.model.entities.Product;

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
@ToString
public class BrandRequest {

	private Integer brandId;
	private String brandName;
}
