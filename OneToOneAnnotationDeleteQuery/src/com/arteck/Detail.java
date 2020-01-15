package com.arteck;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="detail")
public class Detail {

	@Id
	@Column(name="did")
	private Integer detailid;
	@Column(name="dname")
	private String detailname;
	
	@OneToOne(targetEntity=Book.class,cascade=CascadeType.ALL)
	@JoinColumn(name="book_id",referencedColumnName="bid")
	private Book parentobject;
	public Integer getDetailid() {
		return detailid;
	}
	public void setDetailid(Integer detailid) {
		this.detailid = detailid;
	}
	public String getDetailname() {
		return detailname;
	}
	public void setDetailname(String detailname) {
		this.detailname = detailname;
	}
	public Book getParentobject() {
		return parentobject;
	}
	public void setParentobject(Book parentobject) {
		this.parentobject = parentobject;
	}
}
