package com.alvaro.retonapptilus.service;
/*********************
*
*
* Clase DTO ReturnParamsDto,,  	
* 
* 
* (Alvaro B.S. octubre 2022)
*
*
*/
import java.time.Instant;

import com.alvaro.retonapptilus.model.PricesModel;

public class ReturnParamsDto {

	// CAMPOS DEVUELTOS:
	//identificador de producto, 
	//identificador de cadena, 
	//tarifa a aplicar, 
	//fechas de aplicación 
	//y precio final a aplicar	
	private Long brandId;
	private Instant startDate;
	private Instant endDate;
	private Long priceList;	
	private Long productId;
	private Double price;

	public ReturnParamsDto() {};
	
	public ReturnParamsDto(PricesModel pricesModel) {
		setAll(pricesModel);
	}
	

	public Long getBrandId() {
		return brandId;
	}


	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}


	public Instant getStartDate() {
		return startDate;
	}


	public void setStartDate(Instant startDate) {
		this.startDate = startDate;
	}


	public Instant getEndDate() {
		return endDate;
	}


	public void setEndDate(Instant endDate) {
		this.endDate = endDate;
	}


	public Long getPriceList() {
		return priceList;
	}


	public void setPriceList(Long priceList) {
		this.priceList = priceList;
	}


	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	// anterior al uso del mapper...
	public void setAll(PricesModel pricesModel) {
		this.productId = pricesModel.getProductId();
		this.brandId = pricesModel.getBrandId();
		this.priceList = pricesModel.getPriceList();
		this.startDate = pricesModel.getStartDate();
		this.endDate = pricesModel.getEndDate();
		this.price = pricesModel.getPrice()	;	
	}
	
	

}
