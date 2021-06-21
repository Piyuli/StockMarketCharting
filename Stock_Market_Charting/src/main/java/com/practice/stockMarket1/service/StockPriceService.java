package com.practice.stockMarket1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.stockMarket1.Entity.StockPrice;
import com.practice.stockMarket1.repository.StockPriceRepository;


@Service
public class StockPriceService {
	@Autowired
	StockPriceRepository repository;

	public StockPrice saveStockPrice(StockPrice stockPrice) {
		return repository.save(stockPrice);
	}
}