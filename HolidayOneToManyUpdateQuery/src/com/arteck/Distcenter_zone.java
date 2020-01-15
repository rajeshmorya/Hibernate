package com.arteck;

import java.util.Set;

public class Distcenter_zone {

	private Integer distcenter_zoneid;
	private Integer subdivisionid;
	private String distcenter_zonename;
	private String distcenter_zoneaddress;
	private Set children;
	public Integer getDistcenter_zoneid() {
		return distcenter_zoneid;
	}
	public void setDistcenter_zoneid(Integer distcenter_zoneid) {
		this.distcenter_zoneid = distcenter_zoneid;
	}
	public Integer getSubdivisionid() {
		return subdivisionid;
	}
	public void setSubdivisionid(Integer subdivisionid) {
		this.subdivisionid = subdivisionid;
	}
	public String getDistcenter_zonename() {
		return distcenter_zonename;
	}
	public void setDistcenter_zonename(String distcenter_zonename) {
		this.distcenter_zonename = distcenter_zonename;
	}
	public String getDistcenter_zoneaddress() {
		return distcenter_zoneaddress;
	}
	public void setDistcenter_zoneaddress(String distcenter_zoneaddress) {
		this.distcenter_zoneaddress = distcenter_zoneaddress;
	}
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
}
