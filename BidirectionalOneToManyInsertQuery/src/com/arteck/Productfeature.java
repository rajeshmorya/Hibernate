package com.arteck;

public class Productfeature {

	private Integer productfeatureid;
	private String productfeaturename;
	//private Integer forevenid;
	private Product parentObject;
	public Integer getProductfeatureid() {
		return productfeatureid;
	}
	public void setProductfeatureid(Integer productfeatureid) {
		this.productfeatureid = productfeatureid;
	}
	public String getProductfeaturename() {
		return productfeaturename;
	}
	public void setProductfeaturename(String productfeaturename) {
		this.productfeaturename = productfeaturename;
	}
/*	public Integer getForevenid() {
		return forevenid;
	}
	public void setForevenid(Integer forevenid) {
		this.forevenid = forevenid;
	}*/
	public Product getParentObject() {
		return parentObject;
	}
	public void setParentObject(Product parentObject) {
		this.parentObject = parentObject;
	}
}
