package com.arteck;

import java.util.Set;

public class Company {

	private Integer companyid;
	private String companyname;
	private Set children;
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
	public void setChildren(Set children) 
	{
		this.children = children;
	}
	public Set getchildren() 
	{
		return children;
	}
}
