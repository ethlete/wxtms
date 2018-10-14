package com.yahui.wxtms.domain.sale;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.yahui.wxtms.domain.BasicDomain;
import com.yahui.wxtms.domain.clothes.Clothes;

@Entity
public class SaleItem extends BasicDomain {
	
	@ManyToOne
	private Clothes clothes;
	@Column(precision=12,scale=2)
	private BigDecimal unitPrice;
	private int amount;
	@ManyToOne
	@JoinColumn
	private SaleBill saleBill;
	
	public Clothes getClothes() {
		return clothes;
	}
	public void setClothes(Clothes clothes) {
		this.clothes = clothes;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public SaleBill getSaleBill() {
		return saleBill;
	}
	public void setSaleBill(SaleBill saleBill) {
		this.saleBill = saleBill;
	}
	
	

}
