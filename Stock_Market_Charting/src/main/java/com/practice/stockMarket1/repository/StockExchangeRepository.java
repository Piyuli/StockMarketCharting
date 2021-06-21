package com.practice.stockMarket1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.stockMarket1.Entity.StockExchange;

public interface StockExchangeRepository extends JpaRepository<StockExchange, Integer> {
	StockExchange findByStockExchangeName(String stockExchangeName);

}
