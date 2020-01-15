package com.arteck;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="course")
public class Course {

	@Id
	@Column(name="courseid")
	private Integer courseid;
	@Column(name="coursename")
	private String coursename;
	
	@ManyToMany(targetEntity=Student.class,mappedBy="Course")

	private Set Student;
	public Integer getCourseid() {
		return courseid;
	}
	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public void setStudent(Set Student) 
	{
		this.Student = Student;
	}
	public Set getStudent() 
	{
		return Student;
	}
}
