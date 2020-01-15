package com.arteck;

public class Subdivision {

	private Integer subdivisionid;
	private String subdivisionname;
	private String subdivisionaddress;
	private Division division_iddivision;
	public Integer getSubdivisionid() {
		return subdivisionid;
	}
	public void setSubdivisionid(Integer subdivisionid) {
		this.subdivisionid = subdivisionid;
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
	public Division getDivision_iddivision() {
		return division_iddivision;
	}
	public void setDivision_iddivision(Division division_iddivision) {
		this.division_iddivision = division_iddivision;
	}
	
}
