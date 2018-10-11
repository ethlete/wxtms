package com.yahui.wxtms.domain;

import java.util.Date;

import com.yahui.wxtms.enumeration.CloGender;
import com.yahui.wxtms.enumeration.CloPart;
import com.yahui.wxtms.enumeration.CloSize;

public class Clothes extends BasicDomain{
	
	private String name;
	private int code;
	private CloGender cloGender;
	private CloPart cloPart;
	private CloSize cloSize;
	private Supplier supplier;
	private String texture;
	// Korea, Japanese, Chinese, General, Loose, Tight...
	private CloStyle style;
	private Date firstMarketedDate;
	private String description;
	

}
