package com.yahui.wxtms.domain.manage;

import javax.persistence.Entity;

import com.yahui.wxtms.domain.BasicDomain;

@Entity
public class TmsUser extends BasicDomain{
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
