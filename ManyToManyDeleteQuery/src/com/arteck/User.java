package com.arteck;

import java.util.Set;

public class User {

	private Integer userid;
	private String username;
	private Set Group;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Set getGroup() {
		return Group;
	}
	public void setGroup(Set group) {
		Group = group;
	}
}
