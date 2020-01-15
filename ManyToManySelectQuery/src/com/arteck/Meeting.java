package com.arteck;

import java.util.Set;

public class Meeting {

	private Integer meetingid;
	private String meetingname;
	private Set Employee;
	public Integer getMeetingid() {
		return meetingid;
	}
	public void setMeetingid(Integer meetingid) {
		this.meetingid = meetingid;
	}
	public String getMeetingname() {
		return meetingname;
	}
	public void setMeetingname(String meetingname) {
		this.meetingname = meetingname;
	}
	public Set getEmployee() {
		return Employee;
	}
	public void setEmployee(Set employee) {
		Employee = employee;
	}
	
}
