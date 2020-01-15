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
@Table(name="post")
public class Post {

	@Id
	@Column(name="pid")
	private Integer postid;
	@Column(name="pname")
	private String postname;
	
	@ManyToMany(targetEntity=Tag.class,cascade=CascadeType.ALL)
	@JoinTable(name="Post_tag",joinColumns=@JoinColumn(name="pid_fk",referencedColumnName="pid"),inverseJoinColumns=@JoinColumn(name="tid_fk",referencedColumnName="tid"))
	private Set Tag;
	public Integer getPostid() {
		return postid;
	}
	public void setPostid(Integer postid) {
		this.postid = postid;
	}
	public String getPostname() {
		return postname;
	}
	public void setPostname(String postname) {
		this.postname = postname;
	}
	public Set getTag() {
		return Tag;
	}
	public void setTag(Set tag) {
		Tag = tag;
	}
}
