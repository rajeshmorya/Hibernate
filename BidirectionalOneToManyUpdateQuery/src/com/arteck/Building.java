package com.arteck;

import java.util.Set;

public class Building {

	private Integer buildingid;
	private String buildingname;
	private Set children;
	
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
	public Integer getBuildingid() {
		return buildingid;
	}
	public void setBuildingid(Integer buildingid) {
		this.buildingid = buildingid;
	}
	public String getBuildingname() {
		return buildingname;
	}
	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}
}
