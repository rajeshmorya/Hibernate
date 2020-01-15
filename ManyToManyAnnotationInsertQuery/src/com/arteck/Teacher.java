package com.arteck;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Teacher")
public class Teacher {

	@Id
	@Column(name="teaid")
	private Integer teacherid;
	
	@Column(name="teachname")
	private String teachername;
	
	@ManyToMany(targetEntity=Students.class,cascade=CascadeType.ALL)
	@JoinTable(name="Teacher_Student",joinColumns=@JoinColumn(name="Teacher_fk",referencedColumnName="teaid"),inverseJoinColumns=@JoinColumn(name="Studentid_fk",referencedColumnName="stuid"))
	
	private Set Student;
	public Integer getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(Integer teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public Set getStudent() {
		return Student;
	}
	public void setStudent(Set student) {
		Student = student;
	}
}
