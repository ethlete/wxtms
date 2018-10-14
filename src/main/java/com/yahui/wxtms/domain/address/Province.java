package com.yahui.wxtms.domain.address;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.yahui.wxtms.domain.BasicDomain;

@Entity
public class Province extends BasicDomain {
	
	@Column(length = 10)
	private String name;
	
	@OneToMany(mappedBy = "province")
	private List<City> cities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	

}
