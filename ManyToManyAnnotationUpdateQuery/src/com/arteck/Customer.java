package com.arteck;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@Column(name="cid")
	private Integer customerid;
	@Column(name="cname")
	private String customername;
	
	@ManyToMany(targetEntity=Item.class,cascade=CascadeType.ALL)
	@JoinTable(name="Customer_Item",joinColumns=@JoinColumn(name="cid_fk",referencedColumnName="cid"),inverseJoinColumns=@JoinColumn(name="item_fk",referencedColumnName="iid"))
	private Set Item;
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public Set getItem() {
		return Item;
	}
	public void setItem(Set item) {
		Item = item;
	}
}
