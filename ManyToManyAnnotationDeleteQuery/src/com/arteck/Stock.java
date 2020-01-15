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
@Table(name="stock")
public class Stock {

	@Id
	@Column(name="sid")
	private Integer stockid;
	@Column(name="sname")
	private String stockname;
	
	@ManyToMany(targetEntity=Category.class,cascade=CascadeType.ALL)
	@JoinTable(name="stock_category",joinColumns=@JoinColumn(name="sid_fk",referencedColumnName="sid"),inverseJoinColumns=@JoinColumn(name="cid_fk",referencedColumnName="cid"))
	private Set Category;
	public Integer getStockid() {
		return stockid;
	}
	public void setStockid(Integer stockid) {
		this.stockid = stockid;
	}
	public String getStockname() {
		return stockname;
	}
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}
	public void setCategory(Set Category) 
	{
		this.Category = Category;
	}
	public Set getCategory() 
	{
		return Category;
	}
}
