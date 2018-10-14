package com.yahui.wxtms.domain.clothes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.yahui.wxtms.domain.BasicDomain;
import com.yahui.wxtms.domain.address.City;
import com.yahui.wxtms.domain.manage.Supplier;
import com.yahui.wxtms.enumeration.CloGender;
import com.yahui.wxtms.enumeration.CloPart;
import com.yahui.wxtms.enumeration.CloSaftyCategory;
import com.yahui.wxtms.enumeration.CloUnit;

@Entity
public class CloBasic extends BasicDomain{

	private int code;
	private String name;
	@ManyToOne
	private CloBrand cloBrand;
	private CloPart cloPart;
	private CloGender cloGender;
	private CloSaftyCategory cloSaftyCategory;
	@ManyToMany
	private List<CloFabDetail> cloFabDetails;
	@ManyToOne
	private Supplier supplier;
	@Column(precision = 10, scale = 2)
	private BigDecimal suggestPrice;
	private CloUnit cloUnit;
	
	
	@ManyToOne
	private City producedFrom;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CloBrand getCloBrand() {
		return cloBrand;
	}
	public void setCloBrand(CloBrand cloBrand) {
		this.cloBrand = cloBrand;
	}
	public CloSaftyCategory getCloSaftyCategory() {
		return cloSaftyCategory;
	}
	public void setCloSaftyCategory(CloSaftyCategory cloSaftyCategory) {
		this.cloSaftyCategory = cloSaftyCategory;
	}
	public List<CloFabDetail> getCloFabDetails() {
		return cloFabDetails;
	}
	public void setCloFabDetails(List<CloFabDetail> cloFabDetails) {
		this.cloFabDetails = cloFabDetails;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public BigDecimal getSuggestPrice() {
		return suggestPrice;
	}
	public void setSuggestPrice(BigDecimal suggestPrice) {
		this.suggestPrice = suggestPrice;
	}
	public City getProducedFrom() {
		return producedFrom;
	}
	public void setProducedFrom(City producedFrom) {
		this.producedFrom = producedFrom;
	}
	public CloPart getCloPart() {
		return cloPart;
	}
	public void setCloPart(CloPart cloPart) {
		this.cloPart = cloPart;
	}
	public CloGender getCloGender() {
		return cloGender;
	}
	public void setCloGender(CloGender cloGender) {
		this.cloGender = cloGender;
	}
	public CloUnit getCloUnit() {
		return cloUnit;
	}
	public void setCloUnit(CloUnit cloUnit) {
		this.cloUnit = cloUnit;
	}
	
}
