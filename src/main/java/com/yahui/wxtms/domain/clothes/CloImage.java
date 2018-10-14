package com.yahui.wxtms.domain.clothes;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;

import com.yahui.wxtms.domain.BasicDomain;

@Entity
public class CloImage extends BasicDomain{
	
	// image name
	private String name;
	
	@Lob
	@Basic(fetch = FetchType. LAZY)
	@Column(columnDefinition = "BLOB")
	private byte[] imgAttach;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getImgAttach() {
		return imgAttach;
	}

	public void setImgAttach(byte[] imgAttach) {
		this.imgAttach = imgAttach;
	}

	
}
