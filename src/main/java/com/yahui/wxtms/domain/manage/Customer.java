package com.yahui.wxtms.domain.manage;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.yahui.wxtms.domain.BasicDomain;

@Entity
public class Customer extends BasicDomain{
	
	private String name;
	
	@ManyToOne
	private ContactInfo contactInfo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

}
