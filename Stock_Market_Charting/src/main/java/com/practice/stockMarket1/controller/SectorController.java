package com.practice.stockMarket1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.stockMarket1.Entity.Company;
import com.practice.stockMarket1.Entity.Sectors;
import com.practice.stockMarket1.service.SectorService;

@RestController
public class SectorController {

	@Autowired
	SectorService sectorService;
	
	@GetMapping("/getCompaniesFromSectors/{id}")
	public List<Company> getCompanyList(@PathVariable int id){
		Sectors sector = sectorService.findById(id);
		return sector.getCompanies();
	}

}