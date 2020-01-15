package com.arteck.mypack;

public class StudentDTO {
	private int rollno;
	private String name;
	private int percentage;
	
	public int getId() 
	{
		return rollno;
	}
	public void setId(int rollno) 
	{
		this.rollno = rollno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getPercentage() 
	{
		return percentage;
	}
	public void setPercentage(int percentage) 
	{
		this.percentage = percentage;
	}
	
}
