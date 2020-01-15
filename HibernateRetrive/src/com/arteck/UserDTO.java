package com.arteck;

public class UserDTO {
	private int id;
	private String username;
	private String address;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getUserName() 
	{
		return username;
	}
	public void setUserName(String username) 
	{
		this.username = username;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
}
