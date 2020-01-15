package com.arteck;

public class Child {

	private Integer childid;
	private String childname;
	private Mother parentObject;
	public Integer getChildid() {
		return childid;
	}
	public void setChildid(Integer childid) {
		this.childid = childid;
	}
	public String getChildname() {
		return childname;
	}
	public void setChildname(String childname) {
		this.childname = childname;
	}
	public Mother getParentObject() {
		return parentObject;
	}
	public void setParentObject(Mother parentObject) {
		this.parentObject = parentObject;
	}
}
