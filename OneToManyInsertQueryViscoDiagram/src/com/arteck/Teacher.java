package com.arteck;

import java.util.Set;

public class Teacher {

	private Integer teacherid;
	private String teachername;
	private Set childern;
	public Integer getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(Integer teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public Set getchildern() 
	{
		return childern;
	}
	public void setchildern(Set childern) 
	{
		this.childern = childern;
	}
}
