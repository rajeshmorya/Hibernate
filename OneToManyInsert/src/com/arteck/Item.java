package com.arteck;

public class Item {

	private Integer Itemid;
	private String Itemname;
	private Cart forevenid;

	public Cart getForevenid() {
		return forevenid;
	}
	public void setForevenid(Cart forevenid) {
		this.forevenid = forevenid;
	}
	public Integer getItemid() {
		return Itemid;
	}
	public void setItemid(Integer itemid) {
		Itemid = itemid;
	}
	public String getItemname() {
		return Itemname;
	}
	public void setItemname(String itemname) {
		Itemname = itemname;
	}
}
