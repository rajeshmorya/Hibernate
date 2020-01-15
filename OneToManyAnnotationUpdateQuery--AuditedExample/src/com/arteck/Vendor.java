package com.arteck;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Entity
@Table(name="vendor_update")
@Audited
public class Vendor {

	@Id
	@Column(name="vid")
	private Integer vendorid;
	
	@Column(name="vname")
	private String vendorname;
	
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Customer.class,cascade=CascadeType.ALL)
	@JoinColumn(name = "venid",referencedColumnName="vid")
	
	private Set children;
	public Integer getVendorid() {
		return vendorid;
	}
	public void setVendorid(Integer vendorid) {
		this.vendorid = vendorid;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public Set getChildren() 
	{
		return children;
	}
	public void setChildren(Set children) 
	{
		this.children = children;
	}
	

}
