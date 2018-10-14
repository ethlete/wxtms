package com.yahui.wxtms.domain.address;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.yahui.wxtms.domain.BasicDomain;

@Entity
public class City extends BasicDomain{

	@Column(length = 10)
	private String name;
	
	@OneToMany(mappedBy = "city")
	private List<District> districts;
	
	@ManyToOne
	@JoinColumn
	private Province province;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}
	
	
}
