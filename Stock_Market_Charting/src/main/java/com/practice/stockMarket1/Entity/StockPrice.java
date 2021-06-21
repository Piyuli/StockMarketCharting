package com.practice.stockMarket1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class StockPrice {
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	private StockExchange stockExchange;
	
	@Column(nullable = false)
	private float stockPrice;
	
	@Column(nullable = false)
	private String date;
	
	@Column(nullable = false)
	private String time;
	

	@ManyToOne
	private CompanyCode companyCode;

	public float getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(float stockPrice) {
		this.stockPrice = stockPrice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getId() {
		return id;
	}


	@JsonBackReference(value = "stockPrice-stockExchange")
	public StockExchange getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(StockExchange stockExchange) {
		this.stockExchange = stockExchange;
	}


	@JsonBackReference(value = "stockPrice-companyCode")
	public CompanyCode getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(CompanyCode companyCode) {
		this.companyCode = companyCode;
	}

	public StockPrice(float stockPrice, String date, String time) {
		super();
		this.stockPrice = stockPrice;
		this.date = date;
		this.time = time;
	}

	public StockPrice(Company company, StockExchange stockExchange, float stockPrice, String date, String time,
			CompanyCode companyCode) {
		super();
		this.stockExchange = stockExchange;
		this.stockPrice = stockPrice;
		this.date = date;
		this.time = time;
		this.companyCode = companyCode;
	}

	public StockPrice() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StockPrice [id=" + id + ", stockExchange=" + stockExchange + ", stockPrice=" + stockPrice + ", date="
				+ date + ", time=" + time + ", companyCode=" + companyCode + "]";
	}

	
	
	
}