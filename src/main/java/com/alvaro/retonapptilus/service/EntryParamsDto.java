package com.alvaro.retonapptilus.service;

import java.time.Instant;

public class EntryParamsDto {

	private Instant instante;
	private Long productId;
	private Long brandId;
	
	public EntryParamsDto() {}
	
	public EntryParamsDto(Instant instante, Long productId, Long brandId) {

		this.instante = instante;
		this.productId = productId;
		this.brandId =brandId;
		
	}
	
	public Instant getInstante() {  
//		System.out.println("en entryparams...");
//		System.out.println(this.fecha);
//		return Timestamp.valueOf(fecha);
		return this.instante;
	}
	public void setInstante(Instant instante) {
		this.instante = instante;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	
	@Override
	public String toString() {
		return "EntryParams_propiedades: instante: "+getInstante()+ ", prodId: " + getProductId() + ", brandId: "+getBrandId();
	}
	

}
