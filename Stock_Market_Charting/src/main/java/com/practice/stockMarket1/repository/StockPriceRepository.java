package com.practice.stockMarket1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.stockMarket1.Entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Integer>{

}
