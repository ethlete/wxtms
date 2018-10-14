package com.yahui.wxtms.domain.purchase;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.yahui.wxtms.domain.BasicDomain;
import com.yahui.wxtms.domain.manage.Supplier;

@Entity
public class PurchaseBill extends BasicDomain{
	
	@OneToMany(mappedBy="purchaseBill")
	private List<PurchaseItem> purchaseItems;
	private Date purchaseDate;
	@ManyToOne
	private Supplier supplier;
	
	public List<PurchaseItem> getPurchaseItems() {
		return purchaseItems;
	}
	public void setPurchaseItems(List<PurchaseItem> purchaseItems) {
		this.purchaseItems = purchaseItems;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}
