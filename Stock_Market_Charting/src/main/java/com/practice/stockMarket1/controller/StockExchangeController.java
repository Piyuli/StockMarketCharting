package com.practice.stockMarket1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.stockMarket1.Entity.Company;
import com.practice.stockMarket1.Entity.StockExchange;
import com.practice.stockMarket1.service.StockExchangeService;


@RestController
public class StockExchangeController {

	@Autowired
	StockExchangeService stockExchangeService;
	
	@PostMapping("/addStockExchange")
	public StockExchange addStockExchange(@RequestBody StockExchange stockExchange) {
		return stockExchangeService.saveStockExchange(stockExchange);
	}
	
	@GetMapping("/stockExchanges")
	public List<StockExchange> getStockExchangeList() {
		return stockExchangeService.getAllStockExchanges();
	}
	
	@GetMapping("/companiesFromStockExchange/{id}")
	public List<Company> getCompaniesFromStockExchange(@PathVariable int id){
		StockExchange _stockExchange = stockExchangeService.findById(id);
		return _stockExchange.getCompanies();
	}
	

}