package com.update;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee1")
public class EmployeeDTO {
	
	
	@Id
	@Column(name="EID")
	private int eid;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SALARY")
	private int salary;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


}
