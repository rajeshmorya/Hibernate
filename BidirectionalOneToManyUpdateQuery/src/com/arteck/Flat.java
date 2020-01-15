package com.arteck;

public class Flat {

	private Integer flatid;
	private String flatname;
	private Building parentObject;
	public Integer getFlatid() {
		return flatid;
	}
	public void setFlatid(Integer flatid) {
		this.flatid = flatid;
	}
	public String getFlatname() {
		return flatname;
	}
	public void setFlatname(String flatname) {
		this.flatname = flatname;
	}
	public Building getParentObject() {
		return parentObject;
	}
	public void setParentObject(Building parentObject) {
		this.parentObject = parentObject;
	}
}
