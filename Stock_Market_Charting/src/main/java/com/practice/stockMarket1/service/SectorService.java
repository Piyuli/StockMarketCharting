package com.practice.stockMarket1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.stockMarket1.Entity.Sectors;
import com.practice.stockMarket1.repository.SectorRepository;

@Service
public class SectorService {
	@Autowired
	SectorRepository repository;
	
	public Sectors saveSector(Sectors sector) {
		return repository.save(sector);
	}	
	
	public List<Sectors> getSectors() {
		return repository.findAll();
	}
	
	public Sectors findById(int id) {
		return repository.findById(id).orElse(null);
	}

}
