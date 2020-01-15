package com.arteck;

public class CarParts {

	private Integer carpartsid;
	private String carpartsname;
	private Car parentObject;
	public Integer getCarpartsid() {
		return carpartsid;
	}
	public void setCarpartsid(Integer carpartsid) {
		this.carpartsid = carpartsid;
	}
	public String getCarpartsname() {
		return carpartsname;
	}
	public void setCarpartsname(String carpartsname) {
		this.carpartsname = carpartsname;
	}
	public Car getParentObject() {
		return parentObject;
	}
	public void setParentObject(Car parentObject) {
		this.parentObject = parentObject;
	}
}
