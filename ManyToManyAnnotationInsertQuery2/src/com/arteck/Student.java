package com.arteck;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="id")
	private Integer studentid;
	@Column(name="name")
	private String studentname;

	@ManyToMany(targetEntity=Course.class,cascade=CascadeType.ALL)
	@JoinTable(name="student_course",joinColumns=@JoinColumn(name="student_id_fk",referencedColumnName="id"),inverseJoinColumns=@JoinColumn(name="courser_id_fk",referencedColumnName="courseid"))
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
	public Set getCourse() {
		return Course;
	}
	public void setCourse(Set course) {
		Course = course;
	}
}
