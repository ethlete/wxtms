package com.yahui.wxtms.domain.inventory;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.yahui.wxtms.domain.BasicDomain;
import com.yahui.wxtms.domain.sale.SaleItem;

@Entity
public class OutboundItem extends BasicDomain{
	
	@ManyToOne
	private SaleItem saleItem;
	@ManyToOne
	@JoinColumn
	private OutboundBill outboundBill;
	//outbound amount
	private int amount;
	
	public SaleItem getSaleItem() {
		return saleItem;
	}
	public void setSaleItem(SaleItem saleItem) {
		this.saleItem = saleItem;
	}
	public OutboundBill getOutboundBill() {
		return outboundBill;
	}
	public void setOutboundBill(OutboundBill outboundBill) {
		this.outboundBill = outboundBill;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
