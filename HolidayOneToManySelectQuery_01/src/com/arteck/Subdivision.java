package com.arteck;

import java.util.Set;

public class Subdivision {

	private Integer subdivisionid;
	private Integer divisionid;
	private String subdivisionname;
	private String subdivisionaddress;
	private Set children;
	public Integer getSubdivisionid() {
		return subdivisionid;
	}
	public void setSubdivisionid(Integer subdivisionid) {
		this.subdivisionid = subdivisionid;
	}
	public Integer getDivisionid() {
		return divisionid;
	}
	public void setDivisionid(Integer divisionid) {
		this.divisionid = divisionid;
	}
	public String getSubdivisionname() {
		return subdivisionname;
	}
	public void setSubdivisionname(String subdivisionname) {
		this.subdivisionname = subdivisionname;
	}
	public String getSubdivisionaddress() {
		return subdivisionaddress;
	}
	public void setSubdivisionaddress(String subdivisionaddress) {
		this.subdivisionaddress = subdivisionaddress;
	}
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
	
}
