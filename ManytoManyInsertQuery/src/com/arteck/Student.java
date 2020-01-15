package com.arteck;

import java.util.Set;

public class Student {

	private Integer studentid;
	private String studentname;
	private int marks;
	private Set Course;
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Set getCourse() {
		return Course;
	}
	public void setCourse(Set course) {
		Course = course;
	}
}
