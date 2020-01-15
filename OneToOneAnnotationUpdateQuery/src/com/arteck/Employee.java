package com.arteck;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column(name="id")
	private Integer employeeid;
	@Column(name="name")
	private String employeename;
	
	@OneToOne(targetEntity=Account.class,cascade=CascadeType.ALL)
	@JoinColumn(name="accont_id",referencedColumnName="aid")
	private Account parentObject;
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public Account getParentObject() {
		return parentObject;
	}
	public void setParentObject(Account parentObject) {
		this.parentObject = parentObject;
	}
}
