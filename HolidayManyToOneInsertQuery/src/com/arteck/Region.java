package com.arteck;

import java.util.Set;

public class Region {

	private Integer regionid;
	private Integer companyid;
	private String regionname;
	private String regionaddress;

	/**
	 * @return the regionid
	 */
	public Integer getRegionid() {
		return regionid;
	}
	/**
	 * @param regionid the regionid to set
	 */
	public void setRegionid(Integer regionid) {
		this.regionid = regionid;
	}
	/**
	 * @return the companyid
	 */
	public Integer getCompanyid() {
		return companyid;
	}
	/**
	 * @param companyid the companyid to set
	 */
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	/**
	 * @return the regionname
	 */
	public String getRegionname() {
		return regionname;
	}
	/**
	 * @param regionname the regionname to set
	 */
	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}
	/**
	 * @return the regionaddress
	 */
	public String getRegionaddress() {
		return regionaddress;
	}
	/**
	 * @param regionaddress the regionaddress to set
	 */
	public void setRegionaddress(String regionaddress) {
		this.regionaddress = regionaddress;
	}

}
