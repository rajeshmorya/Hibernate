package com.arteck;

import java.util.Set;

public class Account {

	private Integer accountid;
	private String accountname;
	private Employee e;

	public Integer getAccountid() {
		return accountid;
	}
	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}

}
