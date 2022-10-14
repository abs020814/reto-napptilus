package com.alvaro.retonapptilus.service;

import java.sql.Timestamp;

public class EntryParamsService {

	private Timestamp fecha;
	private Long productId;
	private Long brandId;
	
	public EntryParamsService(Timestamp fecha, Long productId, Long brandId) {

		this.fecha = fecha;
		this.productId = productId;
		this.brandId =brandId;
	}
	
	public Timestamp getFecha() {  
//		System.out.println("en entryparams...");
//		System.out.println(this.fecha);
//		return Timestamp.valueOf(fecha);
		return this.fecha;
	}
	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
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
	
	@Override
	public String toString() {
		return "EntryParams_propiedades: fecha: "+getFecha()+ ", prodId: " + getProductId() + ", brandId: "+getBrandId();
	}
	

}
