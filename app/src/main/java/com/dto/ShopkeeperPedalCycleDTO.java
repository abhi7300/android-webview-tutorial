package com.dto;

public class ShopkeeperPedalCycleDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3458146320354313016L;
	private String descriptionOfAcessories;
	private String frameNumber;
	private String manufacturerName;
	private String model;
	private String value;
	
	
	public String getDescriptionOfAcessories() {
		return descriptionOfAcessories;
	}
	public void setDescriptionOfAcessories(String descriptionOfAcessories) {
		this.descriptionOfAcessories = descriptionOfAcessories;
	}
	public String getFrameNumber() {
		return frameNumber;
	}
	public void setFrameNumber(String frameNumber) {
		this.frameNumber = frameNumber;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
