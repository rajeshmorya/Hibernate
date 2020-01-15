package com.arteck;

import java.util.Set;

public class Project {

	private Integer projectid;
	private String projectname;
	private Set Employee;
	public Integer getProjectid() {
		return projectid;
	}
	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public Set getEmployee() {
		return Employee;
	}
	public void setEmployee(Set employee) {
		Employee = employee;
	}
}
