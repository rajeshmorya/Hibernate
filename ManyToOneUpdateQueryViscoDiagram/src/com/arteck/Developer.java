package com.arteck;

public class Developer {

	private Integer developerid;
	private String developername;
	private Project parentObject;
	public Integer getDeveloperid() {
		return developerid;
	}
	public void setDeveloperid(Integer developerid) {
		this.developerid = developerid;
	}
	public String getDevelopername() {
		return developername;
	}
	public void setDevelopername(String developername) {
		this.developername = developername;
	}
	public Project getParentObject() {
		return parentObject;
	}
	public void setParentObject(Project parentObject) {
		this.parentObject = parentObject;
	}
}
