package com.practice.stockMarket1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.stockMarket1.Entity.Sectors;
import com.practice.stockMarket1.Entity.Company;

public interface SectorRepository extends JpaRepository<Sectors, Integer>{

}
