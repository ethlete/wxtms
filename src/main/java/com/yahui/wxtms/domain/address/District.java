package com.yahui.wxtms.domain.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.yahui.wxtms.domain.BasicDomain;

@Entity
public class District extends BasicDomain {
	
	@Column(length = 10)
	private String name;
	
	@ManyToOne
	@JoinColumn
	private City city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	

}
