package com.arteck;

public class UserAddress {

	private Integer useraddressid;
	private String Useraddressname;
	private User parentObject;
	public Integer getUseraddressid() {
		return useraddressid;
	}
	public void setUseraddressid(Integer useraddressid) {
		this.useraddressid = useraddressid;
	}

	public User getParentObject() {
		return parentObject;
	}
	public void setParentObject(User parentObject) {
		this.parentObject = parentObject;
	}
	public String getUseraddressname() {
		return Useraddressname;
	}
	public void setUseraddressname(String useraddressname) {
		Useraddressname = useraddressname;
	}
}
