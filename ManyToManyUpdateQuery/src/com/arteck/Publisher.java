package com.arteck;

import java.util.Set;

public class Publisher {

	private Integer publisherid;
	private String publishername;
	private Set Book;
	public Integer getPublisherid() {
		return publisherid;
	}
	public void setPublisherid(Integer publisherid) {
		this.publisherid = publisherid;
	}
	public String getPublishername() {
		return publishername;
	}
	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}
	public Set getBook() {
		return Book;
	}
	public void setBook(Set book) {
		Book = book;
	}
}
