package com.productcatalog.model.entities;

import com.productcatalog.model.enumc.OfferType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
	@SequenceGenerator(name = "offer_gen", sequenceName = "offer_seq", allocationSize = 1000, initialValue = 1)
	@GeneratedValue(generator = "offer_gen", strategy = GenerationType.AUTO)
	private Integer offerId;
	@Enumerated(EnumType.STRING)
	private OfferType offersType;
	private String description;
}
