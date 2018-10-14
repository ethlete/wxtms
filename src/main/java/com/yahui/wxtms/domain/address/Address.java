package com.yahui.wxtms.domain.address;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.yahui.wxtms.domain.BasicDomain;

@Entity
public class Address extends BasicDomain{
	
	private String alternativeName;
	@ManyToOne
	private District district;
	@ManyToOne
	private City city;
	@ManyToOne
	private Province province;
	
	private String detail;

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getAlternativeName() {
		return alternativeName;
	}

	public void setAlternativeName(String alternativeName) {
		this.alternativeName = alternativeName;
	}
	

	
}
