package com.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student1")
public class StudentDTO {
	
	@Id
	@Column(name="SID")
	private int sid;
	
	@Column(name="NAME")
    private String name;
	
	@Column(name="DIVISION")
    private String division;
    
    
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
    
    
    
}
