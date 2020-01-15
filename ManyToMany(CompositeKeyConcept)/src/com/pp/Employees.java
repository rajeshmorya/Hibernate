package com.pp;

import java.io.Serializable;
import java.util.Set;


public class Employees implements Serializable{
	
	private Integer empId;
	private String empName;
	private Set certificates;
	private Integer createdDate=5112019;
	private String createdBy="shashank";
	
	public Integer getEmpId() {
		return empId;
	}
	
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Set getCertificates() {
		return certificates;
	}
	public void setCertificates(Set certificates) {
		this.certificates = certificates;
	}
	public Integer getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Integer createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	

}
