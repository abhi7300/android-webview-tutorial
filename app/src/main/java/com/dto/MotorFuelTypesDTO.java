package com.dto;

public class MotorFuelTypesDTO extends BaseDTO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8255619906964076187L;
	private String fuelTypeId;
    private String description;
	public String getFuelTypeId() {
		return fuelTypeId;
	}
	public void setFuelTypeId(String fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
