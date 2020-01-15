package com.arteck;

import java.util.Set;

public class Bank {

	private Integer bankid;
	private String bankname;
	private Set childern;
	public Integer getBankid() {
		return bankid;
	}
	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
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
