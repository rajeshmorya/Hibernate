package com.arteck;

import java.util.Set;

public class Mother {

	private Integer motherid;
	private String mothername;
	private Set childern;
	public Integer getMotherid() {
		return motherid;
	}
	public void setMotherid(Integer motherid) {
		this.motherid = motherid;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public Set getChildern() {
		return childern;
	}
	public void setChildern(Set childern) {
		this.childern = childern;
	}
}
