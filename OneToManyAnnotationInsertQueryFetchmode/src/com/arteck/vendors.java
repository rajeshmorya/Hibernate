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

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name="vendors")
public class vendors {

	@Id
	@Column(name="vid")
	private Integer vendorid;
	@Column(name="vname")
	private String vendorname;
	

	@OneToMany(fetch=FetchType.LAZY, targetEntity=customers.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "venid", referencedColumnName="vid")
	@Fetch(FetchMode.SELECT)
   // @BatchSize(size = 4)
	private Set children;
	
	public Set getChildren() {
		return children;
	}
	public void setChildren(Set children) {
		this.children = children;
	}
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
}
