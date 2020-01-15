package com.arteck;

import java.util.Set;

public class Company {

	private Integer companyid;
	private String  companyname;
	private String initials;
	private String email;
	private Integer contact;
	private String address;
	private Set children;
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getContact() {
		return contact;
	}
	public void setContact(Integer contact) {
		this.contact = contact;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the children
	 */
	public Set getChildren() {
		return children;
	}
	/**
	 * @param children the children to set
	 */
	public void setChildren(Set children) {
		this.children = children;
	}
}
