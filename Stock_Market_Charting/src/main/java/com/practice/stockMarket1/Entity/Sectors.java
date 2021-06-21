package com.practice.stockMarket1.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Sectors {
	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false, unique = true)
    private String sectorName;
    
    @Column(nullable = false)
    private String brief;
    
    @OneToMany(mappedBy = "sector", fetch=FetchType.LAZY)
    private List<Company> companies = new ArrayList<>();
    
    public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public int getId() {
		return id;
	}

	@JsonManagedReference(value = "company-sector")
	public List<Company> getCompanies() {
		return companies;
	}

	public void addCompany(Company company) {
		this.companies.add(company);
	}

	public Sectors(String sectorName, String brief) {
		super();
		this.sectorName = sectorName;
		this.brief = brief;
	}

	public Sectors(String sectorName, String brief, List<Company> companies) {
		super();
		this.sectorName = sectorName;
		this.brief = brief;
		this.companies = companies;
	}

	public Sectors() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sector [id=" + id + ", sectorName=" + sectorName + ", brief=" + brief + "]";
	}
}