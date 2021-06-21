package com.practice.stockMarket1.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
public class CompanyCode {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = false)
	private int companyCode;
	
	@ManyToOne
	private Company company;
	

	@OneToMany(mappedBy = "companyCode", fetch=FetchType.LAZY)
	private List<StockPrice> stockPrices;
	
	@ManyToOne
	private StockExchange stockExchange;

	
	
	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	@JsonBackReference(value = "companyCode-company")
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@JsonManagedReference(value = "stockPrice-companyCode")
	public List<StockPrice> getStockPrice() {
		return stockPrices;
	}

	public void addStockPrice(StockPrice stockPrice) {
		this.stockPrices.add(stockPrice);
	}
	@JsonBackReference(value = "companyCode-stockExchange")
	public StockExchange getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(StockExchange stockExchange) {
		this.stockExchange = stockExchange;
	}


	

	public CompanyCode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompanyCode(int companyCode) {
		super();
		this.companyCode = companyCode;
	}

	@Override
	public String toString() {
		return "CompanyCode [id=" + id + ", companyCode=" + companyCode + ", company=" + company + ", stockExchange="
				+ stockExchange + "]";
	}

	
	

}