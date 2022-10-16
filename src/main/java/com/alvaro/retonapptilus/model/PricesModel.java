package com.alvaro.retonapptilus.model;
/*********************
*
*
* Clase Entity PricesModel ,, 
* 	queda sin Id concreta, y se define en clase aparte PricesPK
* 
* 
* (Alvaro B.S. octubre 2022)
*
*
*/
import java.io.Serializable;
import java.time.Instant;

import javax.persistence.*;

@Entity
@IdClass(PricesPK.class)
@Table(name="Prices")
public class PricesModel implements Serializable{

	@Id
	//foreign key de la cadena del grupo
	@Column(name="Brand_Id")
	private Long brandId;
	
	@Id
	//fecha y hora del inicio de la vigencia
	@Column(name="Start_Date")
	private Instant startDate;
	
	@Id
	//fecha y hora del fin de la vigencia
	@Column(name="End_Date")
	private Instant endDate;

	@Id
	@Column(name="Price_List")
	private Long priceList;

	@Id
	@Column(name="Product_Id")
	private Long productId;

	@Id
	@Column(name="Priority")
	private Long priority;

	@Id
	@Column(name="Price")
	private Double price;

	@Id
	@Column(name="Curr")
	private String curr;

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

	public Long getPriority() {
		return priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}
	
	//// getters & setters....
	

	
	
	
	
}
