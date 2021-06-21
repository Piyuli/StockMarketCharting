package com.practice.stockMarket1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.stockMarket1.Entity.CompanyCode;

public interface CompanyCodeRepository extends JpaRepository<CompanyCode, Integer>{
	CompanyCode findByCompanyCode(int companyCode);
}
