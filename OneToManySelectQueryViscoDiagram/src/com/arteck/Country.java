package com.arteck;

import java.util.Set;

public class Country {
		
	private Integer countryid;
	private String countryname;
	private Set childern;
	public Integer getCountryid() {
		return countryid;
	}
	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
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
