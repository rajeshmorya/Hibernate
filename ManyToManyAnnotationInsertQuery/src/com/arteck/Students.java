package com.arteck;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Students {

	@Id
	@Column(name="stuid")
	private Integer studentid;
	
	@Column(name="stuname")
	private String studentname;
	
	@ManyToMany(targetEntity=Teacher.class,mappedBy="Students")
	@JoinTable(name="Teacher_Student",joinColumns=@JoinColumn(name="Teacher_fk",referencedColumnName="teaid"),inverseJoinColumns=@JoinColumn(name="Studentid_fk",referencedColumnName="stuid"))
	
	private Set Teacher;
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

	public Set getTeacher() {
		return Teacher;
	}

	public void setTeacher(Set teacher) {
		Teacher = teacher;
	}
}
