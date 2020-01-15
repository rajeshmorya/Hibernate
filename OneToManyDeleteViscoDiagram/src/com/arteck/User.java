package com.arteck;

import java.util.Set;

public class User {
	
	private Integer Userid;
	private String Username;
	private Set childern;
	public Integer getUserid() {
		return Userid;
	}
	public void setUserid(Integer userid) {
		Userid = userid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
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
