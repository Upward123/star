package com.weshare.entity;

public class Ad {
	private Integer AId;
	private String AdImag;
	private String AdDescription;
	public Integer getAId() {
		return AId;
	}
	public void setAId(Integer aId) {
		AId = aId;
	}
	public String getAdImag() {
		return AdImag;
	}
	public void setAdImag(String adImag) {
		AdImag = adImag;
	}
	public String getAdDescription() {
		return AdDescription;
	}
	public void setAdDescription(String adDescription) {
		AdDescription = adDescription;
	}
	
	@Override
	public String toString() {
		return "Ad [AId=" + AId + ", AdImag=" + AdImag + ", AdDescription=" + AdDescription + "]";
	}
}
