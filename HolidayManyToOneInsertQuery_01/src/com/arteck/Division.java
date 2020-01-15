package com.arteck;

public class Division {

	private Integer divisionid;
	private Integer circleid;
	private String divisionname;
	private String divisionaddress;
	private Circle parentObject;
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
	public Circle getParentObject() {
		return parentObject;
	}
	public void setParentObject(Circle parentObject) {
		this.parentObject = parentObject;
	}
	
}
