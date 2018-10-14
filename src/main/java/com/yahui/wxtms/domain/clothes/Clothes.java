package com.yahui.wxtms.domain.clothes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.yahui.wxtms.domain.BasicDomain;
import com.yahui.wxtms.enumeration.CloColor;
import com.yahui.wxtms.enumeration.CloSize;

@Entity
public class Clothes extends BasicDomain{

	@ManyToOne
	private CloBasic cloBasic;
	@Enumerated(EnumType.STRING)
	private CloColor cloColor;
	@Enumerated(EnumType.STRING)
	private CloSize cloSize;
	@ManyToMany
	private List<CloImage> colImages;
	@Column(precision = 12, scale = 2)
	private BigDecimal purchasePriceRef;
	@Column(precision = 12, scale = 2)
	private BigDecimal unitSalePriceRef;
	@Column(precision = 12, scale = 2)
	private BigDecimal bulkSalePriceRef;
	
	public CloBasic getCloBasic() {
		return cloBasic;
	}
	public void setCloBasic(CloBasic cloBasic) {
		this.cloBasic = cloBasic;
	}
	public CloColor getCloColor() {
		return cloColor;
	}
	public void setCloColor(CloColor cloColor) {
		this.cloColor = cloColor;
	}
	public CloSize getCloSize() {
		return cloSize;
	}
	public void setCloSize(CloSize cloSize) {
		this.cloSize = cloSize;
	}
	public BigDecimal getPurchasePriceRef() {
		return purchasePriceRef;
	}
	public void setPurchasePriceRef(BigDecimal purchasePriceRef) {
		this.purchasePriceRef = purchasePriceRef;
	}
	public BigDecimal getUnitSalePriceRef() {
		return unitSalePriceRef;
	}
	public void setUnitSalePriceRef(BigDecimal unitSalePriceRef) {
		this.unitSalePriceRef = unitSalePriceRef;
	}
	public BigDecimal getBulkSalePriceRef() {
		return bulkSalePriceRef;
	}
	public void setBulkSalePriceRef(BigDecimal bulkSalePriceRef) {
		this.bulkSalePriceRef = bulkSalePriceRef;
	}
	public List<CloImage> getColImages() {
		return colImages;
	}
	public void setColImages(List<CloImage> colImages) {
		this.colImages = colImages;
	}
	
	
	
}
