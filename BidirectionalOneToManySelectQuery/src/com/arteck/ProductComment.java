package com.arteck;

public class ProductComment {

	private Integer productcommentid;
	private String productcommentname;
	private Integer forevenid;
	private Product parentObject;
	public Integer getProductcommentid() {
		return productcommentid;
	}
	public void setProductcommentid(Integer productcommentid) {
		this.productcommentid = productcommentid;
	}
	public String getProductcommentname() {
		return productcommentname;
	}
	public void setProductcommentname(String productcommentname) {
		this.productcommentname = productcommentname;
	}
	public Integer getForevenid() {
		return forevenid;
	}
	public void setForevenid(Integer forevenid) {
		this.forevenid = forevenid;
	}
	public Product getParentObject() {
		return parentObject;
	}
	public void setParentObject(Product parentObject) {
		this.parentObject = parentObject;
	}
}
