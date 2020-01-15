package com.arteck;

import java.util.Set;

public class Division {

	private Integer divisionid;
	private Integer circleid;
	private String divisionname;
	private String divisionaddress;
	private Set children;
	public Integer getDivisionid() {
		return divisionid;
	}
	public void setDivisionid(Integer divisionid) {
		this.divisionid = divisionid;
	}
	public Integer getCircleid() {
		return circleid;
	}
	public void setCircleid(Integer circleid) {
		this.circleid = circleid;
	}
	public String getDivisionname() {
		return divisionname;
	}
	public void setDivisionname(String divisionname) {
		this.divisionname = divisionname;
	}
	public String getDivisionaddress() {
		return divisionaddress;
	}
	public void setDivisionaddress(String divisionaddress) {
		this.divisionaddress = divisionaddress;
	}
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
}
