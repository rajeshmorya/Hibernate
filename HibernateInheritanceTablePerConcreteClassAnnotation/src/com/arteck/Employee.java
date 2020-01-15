package com.arteck;

import javax.persistence.*;  

@Entity  
@Table(name = "employee102")  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  
  
public class Employee {  
@Id  
@GeneratedValue(strategy=GenerationType.AUTO)  
      
@Column(name = "id")  
private Integer id;  
  
@Column(name = "name")  
private String name;  
  
public void setId(Integer id) 
{
	this.id= id;
}
public Integer getId() 
{
	return id;
}
public void setname(String name) 
{
	this.name = name;
}
public String getname() 
{
	return name;
}
}  
