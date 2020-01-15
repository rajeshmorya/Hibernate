package com.arteck;

import java.util.Set;

public class Employee {

	private Integer employeeid;
	private String employeename;
	private Set Meeting;
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public Set getMeeting() {
		return Meeting;
	}
	public void setMeeting(Set meeting) {
		Meeting = meeting;
	}
}
