package com.arteck;

public class Circle {

	private Integer circleid;
	private String circlename;
	private String circleaddress;
	private Region parentObject;
	/**
	 * @return the circleid
	 */
	public Integer getCircleid() {
		return circleid;
	}
	/**
	 * @param circleid the circleid to set
	 */
	public void setCircleid(Integer circleid) {
		this.circleid = circleid;
	}
	/**
	 * @return the circlename
	 */
	public String getCirclename() {
		return circlename;
	}
	/**
	 * @param circlename the circlename to set
	 */
	public void setCirclename(String circlename) {
		this.circlename = circlename;
	}
	/**
	 * @return the circleaddress
	 */
	public String getCircleaddress() {
		return circleaddress;
	}
	/**
	 * @param circleaddress the circleaddress to set
	 */
	public void setCircleaddress(String circleaddress) {
		this.circleaddress = circleaddress;
	}
	public Region getParentObject() {
		return parentObject;
	}
	public void setParentObject(Region parentObject) {
		this.parentObject = parentObject;
	}
}
