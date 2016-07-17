package com.dto;

public class PedalCycleDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6419353145935070685L;

	 private String itemNumber;
     private String makeAndManufacturer;
     private String yearOfManufacture;
     private String frameNumber;
     private String value;
     
     
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getMakeAndManufacturer() {
		return makeAndManufacturer;
	}
	public void setMakeAndManufacturer(String makeAndManufacturer) {
		this.makeAndManufacturer = makeAndManufacturer;
	}
	public String getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public String getFrameNumber() {
		return frameNumber;
	}
	public void setFrameNumber(String frameNumber) {
		this.frameNumber = frameNumber;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
     
     
}
