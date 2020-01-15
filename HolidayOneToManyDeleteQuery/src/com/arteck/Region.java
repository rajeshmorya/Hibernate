package com.arteck;

import java.util.Set;

public class Region {

	private Integer regionid;
	private Integer companyid;
	private String regionname;
	private String regionaddress;
	private Set childern;
	public Integer getRegionid() {
		return regionid;
	}
	public void setRegionid(Integer regionid) {
		this.regionid = regionid;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	public String getRegionname() {
		return regionname;
	}
	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}
	public String getRegionaddress() {
		return regionaddress;
	}
	public void setRegionaddress(String regionaddress) {
		this.regionaddress = regionaddress;
	}
	public Set getChildern() {
		return childern;
	}
	public void setChildern(Set childern) {
		this.childern = childern;
	}
}
