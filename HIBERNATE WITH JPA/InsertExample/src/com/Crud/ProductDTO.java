package com.Crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product1")
public class ProductDTO {
	
	@Id
	@Column(name="PID")
	private int pid;
	
	@Column(name="PNAME")
	private String pname;
	
	@Column(name="PRICE")
	private int price;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
	

}
