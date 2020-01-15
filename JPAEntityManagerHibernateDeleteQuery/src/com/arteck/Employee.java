package com.arteck;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="ename")
	private String name;
	@Column(name="salary")
	private Integer salary;
	@Column(name="deptNo")
	private Integer depno;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getDepno() {
		return depno;
	}
	public void setDepno(Integer depno) {
		this.depno = depno;
	}
	
}
