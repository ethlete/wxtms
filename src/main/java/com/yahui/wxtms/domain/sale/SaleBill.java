package com.yahui.wxtms.domain.sale;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.yahui.wxtms.domain.BasicDomain;
import com.yahui.wxtms.domain.manage.Customer;

@Entity
public class SaleBill extends BasicDomain{
	
	@OneToMany(mappedBy="saleBill")
	private List<SaleItem> saleItems;
	private Date saleDate;
	@ManyToOne
	private Customer customer;
	
	public List<SaleItem> getSaleItems() {
		return saleItems;
	}
	public void setSaleItems(List<SaleItem> saleItems) {
		this.saleItems = saleItems;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
