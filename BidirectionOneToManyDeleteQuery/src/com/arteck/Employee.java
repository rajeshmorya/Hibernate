package com.arteck;

public class Employee {

	private Integer employeeid;
	private String employename;
	private Company parentObject;
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployename() {
		return employename;
	}
	public void setEmployename(String employename) {
		this.employename = employename;
	}
	public Company getParentObject() {
		return parentObject;
	}
	public void setParentObject(Company parentObject) {
		this.parentObject = parentObject;
	}
}
