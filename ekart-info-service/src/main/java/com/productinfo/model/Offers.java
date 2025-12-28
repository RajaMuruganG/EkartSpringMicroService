package com.productinfo.model;



import com.productinfo.enums.OffersType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class Offers {

	private Integer offerId;
	@Enumerated(EnumType.STRING)
	private OffersType offersType;
	private String description;
}
