package com.arteck;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class user {

	@Id
	@Column(name="uid")
	private Integer userid;
	@Column(name="uname")
	private String username;
	
	@OneToOne(targetEntity=profile.class,cascade=CascadeType.ALL)
	@JoinColumn(name="pro_id",referencedColumnName="pid")
	private profile parent;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public profile getParent() {
		return parent;
	}
	public void setParent(profile parent) {
		this.parent = parent;
	}

}
