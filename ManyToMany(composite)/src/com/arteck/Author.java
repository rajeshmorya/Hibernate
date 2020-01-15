package com.arteck;

import java.util.Set;

public class Author {

	private Integer authorid;
	private String authorname;
	private Set Book;
	public Integer getAuthorid() {
		return authorid;
	}
	public void setAuthorid(Integer authorid) {
		this.authorid = authorid;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public Set getBook() {
		return Book;
	}
	public void setBook(Set book) {
		Book = book;
	}
}
