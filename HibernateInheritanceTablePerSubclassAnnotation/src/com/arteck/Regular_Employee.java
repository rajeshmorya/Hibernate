package com.arteck;

import javax.persistence.*;  

@Entity  
@Table(name="regularemployee103")  
@PrimaryKeyJoinColumn(name="ID")  
public class Regular_Employee extends Employee{  
      
@Column(name="salary")    
private float salary;  
  
@Column(name="bonus")     
private Integer bonus;  
  
public void setSalary(float salary) 
{
	this.salary = salary;
}
public float getSalary() 
{
	return salary;
}
public Integer getBonus() 
{
	return bonus;
}
public void setBonus(Integer bonus) 
{
	this.bonus = bonus;
}
}  