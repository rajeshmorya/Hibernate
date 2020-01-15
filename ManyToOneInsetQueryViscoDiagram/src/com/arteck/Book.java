package com.arteck;

public class Book {

	private Integer bookid;
	private String bookname;
	private Author parentObject;
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Author getParentObject() {
		return parentObject;
	}
	public void setParentObject(Author parentObject) {
		this.parentObject = parentObject;
	}
}
