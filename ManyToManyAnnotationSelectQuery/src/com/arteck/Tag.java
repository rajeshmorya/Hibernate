package com.arteck;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tag")
public class Tag {

	@Id
	@Column(name="tid")
	private Integer tagid;
	@Column(name="tname")
	private String tagname;
	
	@ManyToMany(targetEntity=Post.class,mappedBy="Tag")
	private Set Post;
	public Integer getTagid() {
		return tagid;
	}
	public void setTagid(Integer tagid) {
		this.tagid = tagid;
	}
	public String getTagname() {
		return tagname;
	}
	public void setTagname(String tagname) {
		this.tagname = tagname;
	}
	public Set getPost() {
		return Post;
	}
	public void setPost(Set post) {
		Post = post;
	}
}
