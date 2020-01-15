package com.arteck;

import java.util.Set;

public class Course {

	private Integer courseid;
	private String coursename;
	private Integer duration;
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
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Set getStudent() {
		return Student;
	}
	public void setStudent(Set student) {
		Student = student;
	}
}
