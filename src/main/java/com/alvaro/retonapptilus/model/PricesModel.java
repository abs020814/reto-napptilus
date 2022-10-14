package com.alvaro.retonapptilus.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@IdClass(PricesPK.class)
@Table(name="Prices")
public class PricesModel implements Serializable{

	// hay algún Id?? Id que agrupa varios campos?
	@Id
	//foreign key de la cadena del grupo
	@Column(name="Brand_Id")
	private Long col001BrandId;
	
	@Id
	//fecha y hora del inicio de la vigencia
	@Column(name="Start_Date")
	private Timestamp col002StartDate;
	
	@Id
	//fecha y hora del fin de la vigencia
	@Column(name="End_Date")
	private Timestamp col003EndDate;

	
	@Column(name="Price_List")
	private Long col004PriceList;

	@Id
	@Column(name="Product_Id")
	private Long col005ProductId;

	@Id
	@Column(name="Priority")
	private Long col006Priority;

	@Column(name="Price")
	private Double col007Price;

	@Column(name="Curr")
	private String col008Curr;
	
	//// getters & setters....
	
	public Long getCol001BrandId() {
		return col001BrandId;
	}
	public void setCol001BrandId(Long col001BrandId) {
		this.col001BrandId = col001BrandId;
	}
	public Timestamp getCol002StartDate() {
		return col002StartDate;
	}
	public void setCol002StartDate(Timestamp col002StartDate) {
		this.col002StartDate = col002StartDate;
	}
	public Timestamp getCol003EndDate() {
		return col003EndDate;
	}
	public void setCol003EndDate(Timestamp col003EndDate) {
		this.col003EndDate = col003EndDate;
	}
	public Long getCol004PriceList() {
		return col004PriceList;
	}
	public void setCol004PriceList(Long col004PriceList) {
		this.col004PriceList = col004PriceList;
	}
	public Long getCol005ProductId() {
		return col005ProductId;
	}
	public void setCol005ProductId(Long col005ProductId) {
		this.col005ProductId = col005ProductId;
	}
	public Long getCol006Priority() {
		return col006Priority;
	}
	public void setCol006Priority(Long col006Priority) {
		this.col006Priority = col006Priority;
	}
	public Double getCol007Price() {
		return col007Price;
	}
	public void setCol007Price(Double col007Price) {
		this.col007Price = col007Price;
	}
	public String getCol008Curr() {
		return col008Curr;
	}
	public void setCol008Curr(String col008Curr) {
		this.col008Curr = col008Curr;
	}
	
	
	
	
}
