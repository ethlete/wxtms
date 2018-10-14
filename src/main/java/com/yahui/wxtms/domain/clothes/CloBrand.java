package com.yahui.wxtms.domain.clothes;

import javax.persistence.Entity;

import com.yahui.wxtms.domain.BasicDomain;

@Entity
public class CloBrand extends BasicDomain{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
