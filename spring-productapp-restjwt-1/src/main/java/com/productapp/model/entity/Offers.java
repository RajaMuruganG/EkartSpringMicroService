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
public class Offers {

	@Id
	@SequenceGenerator(name = "offer_gen", sequenceName = "offer_seq",allocationSize = 1, initialValue = 100)
	@GeneratedValue(generator = "offer_gen", strategy = GenerationType.AUTO)
	private Integer offerId;
	
	private String offerType;
	
}
