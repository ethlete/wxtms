package com.yahui.wxtms.domain.inventory;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.yahui.wxtms.domain.BasicDomain;
import com.yahui.wxtms.domain.sale.SaleBill;

@Entity
public class OutboundBill extends BasicDomain{

	@ManyToOne
	private SaleBill saleBill;
	@OneToMany(mappedBy="outboundBill")
	private List<OutboundItem> outboundItems;
	
	public SaleBill getSaleBill() {
		return saleBill;
	}
	public void setSaleBill(SaleBill saleBill) {
		this.saleBill = saleBill;
	}
	public List<OutboundItem> getOutboundItems() {
		return outboundItems;
	}
	public void setOutboundItems(List<OutboundItem> outboundItems) {
		this.outboundItems = outboundItems;
	}
	
}
