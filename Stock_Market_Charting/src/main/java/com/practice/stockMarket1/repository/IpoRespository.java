package com.practice.stockMarket1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.stockMarket1.Entity.IPODetails;

public interface IpoRespository extends JpaRepository<IPODetails, Integer> {

}
