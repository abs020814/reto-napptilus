package com.alvaro.retonapptilus.service;

import java.sql.Timestamp;

import com.alvaro.retonapptilus.model.PricesModel;

public class ReturnParamsService {

	//identificador de producto, identificador de cadena, tarifa a aplicar, fechas de aplicación y precio final a aplicar	
	private Long productId;
	private Long brandId;
	private Long priceList;
	private Timestamp fechaDesde;
	private Timestamp fechaHasta;
	private Double price;

	public ReturnParamsService(PricesModel pricesModel) {
		this.productId = pricesModel.getCol005ProductId();
		this.brandId = pricesModel.getCol001BrandId();
		this.priceList = pricesModel.getCol004PriceList();
		this.fechaDesde = pricesModel.getCol002StartDate();
		this.fechaHasta = pricesModel.getCol003EndDate();
		this.price = pricesModel.getCol007Price();
	}
	public Long getPriceList() {
		return priceList;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setPriceList(Long priceList) {
		this.priceList = priceList;
	}
	public Timestamp getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(Timestamp fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public Timestamp getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(Timestamp fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		productId = productId;
	}
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		brandId = brandId;
	}
	
	

}
