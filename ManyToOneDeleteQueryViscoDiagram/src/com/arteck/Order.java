package com.arteck;

public class Order {

	private Integer orderid;
	private String ordername;
	private Customer parentObject;
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public Customer getParentObject() {
		return parentObject;
	}
	public void setParentObject(Customer parentObject) {
		this.parentObject = parentObject;
	}
}
