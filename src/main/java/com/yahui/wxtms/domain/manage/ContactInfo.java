package com.yahui.wxtms.domain.manage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.yahui.wxtms.domain.BasicDomain;
import com.yahui.wxtms.domain.address.Address;

@Entity
public class ContactInfo extends BasicDomain {
	
	private String name;
	
	private String wechatID;
	
	@Column(length = 20)
	private String mobileNumber;
	
	@Column(length = 20)
	private String phoneNumber;
	
	@ManyToOne
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWechatID() {
		return wechatID;
	}

	public void setWechatID(String wechatID) {
		this.wechatID = wechatID;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	

}
