package com.arteck;

import java.util.Set;

public class Employee {
	
	private Integer employeid;
	private String employename;
	private Set childern;
	public Integer getEmployeid() {
		return employeid;
	}
	public void setEmployeid(Integer employeid) {
		this.employeid = employeid;
	}
	public String getEmployename() {
		return employename;
	}
	public void setEmployename(String employename) {
		this.employename = employename;
	}
	public Set getchildern() 
	{
		return childern;
	}
	public void setchildern(Set childern) 
	{
		this.childern = childern;
	}
}
