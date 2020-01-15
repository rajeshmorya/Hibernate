package com.arteck;

import javax.persistence.*;  
  
@NamedQueries(  
    {  
        @NamedQuery(  
        name = "xyz",  
        query = "from Employee01 e where e.name = :name"  
        )  
    }  
)  
  
@Entity  
@Table(name="employee01")  
public class Employee01 {  
      
    public String toString(){return id+" "+name+" "+salary+" "+job;}  
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;  
    
    @Column(name="name")
    private String name;  
    @Column(name="salary")
    private Integer salary; 
    @Column(name="job")
    private String job;  
  
    public void setId(Integer id) 
    {
    	this.id = id;
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
    public void setSalary(Integer salary) 
    {
    	this.salary = salary;
    }
    public Integer getSalary() 
    {
    	return salary;
    }
    public void setJob(String job) 
    {
    	this.job = job;
    }
    public String job() 
    {
    	return job;
    }
    //getters and setters  
} 
