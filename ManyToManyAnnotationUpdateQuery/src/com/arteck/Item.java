package com.arteck;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Item {

	@Id
	@Column(name="iid")
	private Integer Itemid;
	@Column(name="iname")
	private String Itemname;
	
	@ManyToMany(targetEntity=Customer.class,mappedBy="Item")
	private Set Customer;
	public Integer getItemid() {
		return Itemid;
	}
	public void setItemid(Integer itemid) {
		Itemid = itemid;
	}
	public String getItemname() {
		return Itemname;
	}
	public void setItemname(String itemname) {
		Itemname = itemname;
	}
	public Set getCustomer() {
		return Customer;
	}
	public void setCustomer(Set customer) {
		Customer = customer;
	}
}
