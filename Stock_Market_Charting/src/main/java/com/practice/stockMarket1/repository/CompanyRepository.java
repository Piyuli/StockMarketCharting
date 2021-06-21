package com.practice.stockMarket1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.practice.stockMarket1.Entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
	@Query("SELECT c FROM COMPANY c WHERE c.companyName LIKE %?1%")
	public List<Company> getCompanyBySearch(String searchString);
	Company findByCompanyName(String companyName);

}
