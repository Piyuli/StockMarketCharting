package com.practice.stockMarket1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.stockMarket1.Entity.CompanyCode;
import com.practice.stockMarket1.repository.CompanyCodeRepository;



@Service
public class CompanyCodeService {
	@Autowired
	CompanyCodeRepository repository;
	
	public CompanyCode saveCompanyCode(CompanyCode companyCode) {
		return repository.save(companyCode);
	}
	
	public CompanyCode findByCompanyCode(int companyCode) {
		return repository.findByCompanyCode(companyCode);
	}

}
	