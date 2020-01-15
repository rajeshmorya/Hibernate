package com.arteck;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="category")
public class Category {

	@Id
	@Column(name="cid")
	private Integer catid;
	@Column(name="cname")
	private String catname;
	
	@ManyToMany(targetEntity=Stock.class,mappedBy="Category")
	private Set Stock;
	public Set getStock() {
		return Stock;
	}
	public void setStock(Set stock) {
		Stock = stock;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	public Integer getCatid() {
		return catid;
	}
	public void setCatid(Integer catid) {
		this.catid = catid;
	}
}
