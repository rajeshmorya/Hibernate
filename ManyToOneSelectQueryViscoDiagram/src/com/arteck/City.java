package com.arteck;

public class City {

	private Integer cityid;
	private String cityname;
	private State parentObject;
	public Integer getCityid() {
		return cityid;
	}
	public void setCityid(Integer cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public State getParentObject() {
		return parentObject;
	}
	public void setParentObject(State parentObject) {
		this.parentObject = parentObject;
	}
}
