package com.alvaro.retonapptilus.model;
/*********************
*
*
* Clase para la PK ficticia del modelo Prices 
*   incluye todos sus campos
* 
* (Alvaro B.S. octubre 2022)
*
*
*/
import java.io.Serializable;
import java.time.Instant;


public class PricesPK implements Serializable {

	protected Long brandId;
	protected Instant startDate;
	protected Instant endDate;
	protected Long priceList;
	protected Long productId;
	protected Long priority;
	protected Double price;
	protected String curr;
	
	public PricesPK() {}

	public PricesPK(Long brandId, Instant startDate, Instant endDate, Long priceList,
			Long productId, Long priority, Double price, String curr) {
		super();
		this.brandId = brandId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priceList = priceList;
		this.productId = productId;
		this.priority = priority;
		this.price = price;
		this.curr = curr;
	}

	
}
