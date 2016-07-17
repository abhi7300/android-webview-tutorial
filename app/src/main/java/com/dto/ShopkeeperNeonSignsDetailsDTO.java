package com.dto;

public class ShopkeeperNeonSignsDetailsDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5085833702234349261L;
	private String description;
	private String descriptionOfPosition;
	private String location;
	private String manfactureYear;
	private String value;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescriptionOfPosition() {
		return descriptionOfPosition;
	}
	public void setDescriptionOfPosition(String descriptionOfPosition) {
		this.descriptionOfPosition = descriptionOfPosition;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getManfactureYear() {
		return manfactureYear;
	}
	public void setManfactureYear(String manfactureYear) {
		this.manfactureYear = manfactureYear;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
