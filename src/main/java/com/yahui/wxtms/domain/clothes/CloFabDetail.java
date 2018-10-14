package com.yahui.wxtms.domain.clothes;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.yahui.wxtms.domain.BasicDomain;
import com.yahui.wxtms.enumeration.CloFabric;

@Entity
public class CloFabDetail extends BasicDomain{
	
	@Column(nullable = false, precision=3, scale=2)
	private double value;
	private CloFabric cloFabric;
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public CloFabric getCloFabric() {
		return cloFabric;
	}
	public void setCloFabric(CloFabric cloFabric) {
		this.cloFabric = cloFabric;
	}
	
	

}
