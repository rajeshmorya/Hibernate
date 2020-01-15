package com.arteck;

import java.util.Set;

public class Book {

	private Integer Bookid;
	private Integer Bookname;
	private Set Author;
	private Integer createdDate;
	private String createdBy;
	public Integer getBookid() {
		return Bookid;
	}
	public void setBookid(Integer bookid) {
		Bookid = bookid;
	}
	public Integer getBookname() {
		return Bookname;
	}
	public void setBookname(Integer bookname) {
		Bookname = bookname;
	}
	public Set getAuthor() {
		return Author;
	}
	public void setAuthor(Set Author) {
		this.Author = Author;
	}
	public Integer getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Integer createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
}
