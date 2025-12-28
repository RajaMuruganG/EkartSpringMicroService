package com.productinfo.model;



import com.productinfo.enums.OffersType;

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
	private OffersType offersType;
	private String description;
}
