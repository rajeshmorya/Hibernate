package com.arteck;

import java.sql.Date;

public class Employee_project {

	private Integer emp_proid;
	private Employee em;
	private Project pro;
	private String activetedname;
	private Date employeedate;
	public Integer getEmp_proid() {
		return emp_proid;
	}
	public void setEmp_proid(Integer emp_proid) {
		this.emp_proid = emp_proid;
	}
	public Employee getEm() {
		return em;
	}
	public void setEm(Employee em) {
		this.em = em;
	}
	public Project getPro() {
		return pro;
	}
	public void setPro(Project pro) {
		this.pro = pro;
	}
	public String getActivetedname() {
		return activetedname;
	}
	public void setActivetedname(String activetedname) {
		this.activetedname = activetedname;
	}
	public Date getEmployeedate() {
		return employeedate;
	}
	public void setEmployeedate(Date employeedate) {
		this.employeedate = employeedate;
	}
	
}
