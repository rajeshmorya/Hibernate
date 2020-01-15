package com.arteck;

import java.util.Set;

public class Circle {

	private Integer circleid;
	private Integer regionid;
	private String circlename;
	private String circleaddress;
	private Set childern;

	public Integer getRegionid() {
		return regionid;
	}
	public void setRegionid(Integer regionid) {
		this.regionid = regionid;
	}
	public String getCirclename() {
		return circlename;
	}
	public void setCirclename(String circlename) {
		this.circlename = circlename;
	}
	public String getCircleaddress() {
		return circleaddress;
	}
	public void setCircleaddress(String circleaddress) {
		this.circleaddress = circleaddress;
	}
	public Set getChildern() {
		return childern;
	}
	public void setChildern(Set childern) {
		this.childern = childern;
	}
	public Integer getCircleid() {
		return circleid;
	}
	public void setCircleid(Integer circleid) {
		this.circleid = circleid;
	}
}
