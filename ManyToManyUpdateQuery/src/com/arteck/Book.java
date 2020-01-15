package com.arteck;

import java.util.Set;

public class Book {

	private Integer bookid;
	private String bookname;
	private Set Publisher;
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public Set getPublisher() {
		return Publisher;
	}
	public void setPublisher(Set publisher) {
		Publisher = publisher;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
}
