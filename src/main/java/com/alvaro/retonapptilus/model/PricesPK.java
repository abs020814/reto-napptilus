package com.alvaro.retonapptilus.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class PricesPK implements Serializable {

	protected Long col001BrandId;
	protected Timestamp col002StartDate;
	protected Timestamp col003EndDate;
	protected Long col004PriceList;
	protected Long col005ProductId;
	protected Long col006Priority;
	protected Double col007Price;
	protected String col008Curr;
	
	public PricesPK() {}

	public PricesPK(Long col001BrandId, Timestamp col002StartDate, Timestamp col003EndDate, Long col004PriceList,
			Long col005ProductId, Long col006Priority, Double col007Price, String col008Curr) {
		super();
		this.col001BrandId = col001BrandId;
		this.col002StartDate = col002StartDate;
		this.col003EndDate = col003EndDate;
		this.col004PriceList = col004PriceList;
		this.col005ProductId = col005ProductId;
		this.col006Priority = col006Priority;
		this.col007Price = col007Price;
		this.col008Curr = col008Curr;
	}

	
}
