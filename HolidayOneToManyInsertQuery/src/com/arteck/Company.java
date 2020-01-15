package com.arteck;

import java.util.Set;

public class Company {

	private Integer companyid;
	private String companyname;
	private Set childern;
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Set getChildern() {
		return childern;
	}
	public void setChildern(Set childern) {
		this.childern = childern;
	}
}
