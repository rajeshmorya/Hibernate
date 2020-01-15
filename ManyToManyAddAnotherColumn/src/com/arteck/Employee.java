package com.arteck;

import java.util.Set;

public class Employee {

	private Integer employeeid;
	private String employename;
	private Set Project;
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
	public Set getProject() {
		return Project;
	}
	public void setProject(Set project) {
		Project = project;
	}
}
