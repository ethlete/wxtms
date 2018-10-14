package com.yahui.wxtms.domain.inventory;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.yahui.wxtms.domain.BasicDomain;
import com.yahui.wxtms.domain.purchase.PurchaseItem;

@Entity
public class InboundItem extends BasicDomain{
	
	@ManyToOne
	private PurchaseItem purchaseItem;
	@ManyToOne
	@JoinColumn
	private InboundBill inboundBill;
	//inbound amount
	private int amount;
	
	public PurchaseItem getPurchaseItem() {
		return purchaseItem;
	}
	public void setPurchaseItem(PurchaseItem purchaseItem) {
		this.purchaseItem = purchaseItem;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
