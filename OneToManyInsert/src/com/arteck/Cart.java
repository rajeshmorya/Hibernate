package com.arteck;

import java.util.Set;

public class Cart {

	private Integer cartid;
	private String cartname;
	private Set children;
	public Integer getCartid() {
		return cartid;
	}
	public void setCartid(Integer cartid) {
		this.cartid = cartid;
	}
	public String getCartname() {
		return cartname;
	}
	public void setCartname(String cartname) {
		this.cartname = cartname;
	}
	public void setChildren(Set children) 
	{
		this.children = children;
	}
	public Set getChildren() 
	{
		return children;
	}

	
}
