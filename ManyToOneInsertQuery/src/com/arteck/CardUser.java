package com.arteck;

public class CardUser {

	private Integer carduserid;
	private String cardusername;
	private Cards parentObject;
	public Integer getCarduserid() {
		return carduserid;
	}
	public void setCarduserid(Integer carduserid) {
		this.carduserid = carduserid;
	}
	public String getCardusername() {
		return cardusername;
	}
	public void setCardusername(String cardusername) {
		this.cardusername = cardusername;
	}
	public Cards getParentObject() {
		return parentObject;
	}
	public void setParentObject(Cards parentObject) {
		this.parentObject = parentObject;
	}
}
