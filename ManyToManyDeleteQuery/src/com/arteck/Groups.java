package com.arteck;

import java.util.Set;

public class Groups {

	private Integer groupid;
	private String groupname;
	private Set User;
	public Integer getGroupid() {
		return groupid;
	}
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public Set getUser() {
		return User;
	}
	public void setUser(Set user) {
		User = user;
	}
}
