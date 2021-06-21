package com.practice.stockMarket1.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.stockMarket1.Entity.CompanyCode;
import com.practice.stockMarket1.Entity.StockExchange;
import com.practice.stockMarket1.Entity.StockPrice;
import com.practice.stockMarket1.service.CompanyCodeService;
import com.practice.stockMarket1.service.StockExchangeService;
import com.practice.stockMarket1.service.StockPriceService;


@RestController
public class StockPriceController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StockPriceService stockPriceService;
	
	@Autowired
	CompanyCodeService companyCodeService;
	
	@Autowired
	StockExchangeService stockExchangeService;
	
	@PostMapping("/addStockPrice")
	public String addStockPrice(@RequestBody List<StockPrice> stockPrice) {
		int _companyCode;
		CompanyCode companyCode;
		StockExchange stockExchange;
		for(StockPrice _stockPrice : stockPrice) {
			_companyCode = _stockPrice.getCompanyCode().getCompanyCode();
			companyCode = companyCodeService.findByCompanyCode(_companyCode);
			_stockPrice.setCompanyCode(companyCode);
			stockExchange = stockExchangeService.getByStockExchangeName(_stockPrice.getStockExchange().getStockExchangeName());
			_stockPrice.setStockExchange(stockExchange);
			stockPriceService.saveStockPrice(_stockPrice);
		}
		return "Saved";
	}
}