package com.arteck;

import javax.persistence.*;  

@Entity  
@Table(name = "employee103")  
@Inheritance(strategy=InheritanceType.JOINED)  
public class Employee {  
	
@Id  
@GeneratedValue(strategy=GenerationType.AUTO)  
      
@Column(name = "id")  
private Integer id;  
  
@Column(name = "name")  
private String name; 

public void setId(Integer id) 
{
	this.id=id;
}
public Integer getId() 
{
	return id;
}
public void setName(String name) 
{
	this.name = name;
}
public String getName() 
{
	return name;
}

}