package com.alvaro.retonapptilus.service;
/*********************
*
*
* Clase DTO auxiliar para API de obtención alternativa 
* 	usando fecha, hora y minutos, por separado
* 
* 
* (Alvaro B.S. octubre 2022)
*
*
*/
import java.time.Instant;
import java.util.Date;

public class EntryParamsAuxDto {

	private String fecha;
	private String hora;
	private String minutos;
	private Long productId;
	private Long brandId;
	
	public EntryParamsAuxDto(String fecha, String hora, String minutos, Long productId, Long brandId) {

		this.fecha = fecha;
		this.hora = hora;
		this.minutos = minutos;
		this.productId = productId;
		this.brandId =brandId;
		
	}
	

	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getMinutos() {
		return minutos;
	}


	public void setMinutos(String minutos) {
		this.minutos = minutos;
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
		return "EntryParams_propiedades: fecha: "+getFecha()+ ", hora: " + getHora() + ", prodId: " + getProductId() + ", brandId: "+getBrandId();
	}
	
	public Instant toInstant() {
		
		Instant instant = null;
		try {
			instant = Instant.parse(getFecha()+"T"+getHora()+":"+getMinutos()+":00Z");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return instant;
		//return fecha
	}

}
