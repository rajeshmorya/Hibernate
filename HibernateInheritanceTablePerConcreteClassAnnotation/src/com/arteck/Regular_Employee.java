package com.arteck;

import javax.persistence.*;  

@Entity

@Table(name="regularemployee102")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
public class Regular_Employee extends Employee{  

@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
private Integer re;
public void setRe(Integer re)
{
	this.re = re;
}
public Integer getRe() 
{
	return re;
}
	 
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