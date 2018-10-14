package com.yahui.wxtms.domain.inventory;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.yahui.wxtms.domain.BasicDomain;
import com.yahui.wxtms.domain.purchase.PurchaseBill;

@Entity
public class InboundBill extends BasicDomain {
	
	@ManyToOne
	private PurchaseBill purchaseBill;
	@OneToMany(mappedBy="inboundBill")
	private List<InboundItem> inboundItems;
	
	public PurchaseBill getPurchaseBill() {
		return purchaseBill;
	}
	public void setPurchaseBill(PurchaseBill purchaseBill) {
		this.purchaseBill = purchaseBill;
	}
	public List<InboundItem> getInboundItems() {
		return inboundItems;
	}
	public void setInboundItems(List<InboundItem> inboundItems) {
		this.inboundItems = inboundItems;
	}
	

}
