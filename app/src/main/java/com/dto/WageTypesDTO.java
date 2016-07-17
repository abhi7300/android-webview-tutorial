package com.dto;

public class WageTypesDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2701815269818434130L;
	private String wageTypeCode;
	private String wageTypeDescription;
	
	
	public String getWageTypeCode() {
		return wageTypeCode;
	}
	public void setWageTypeCode(String wageTypeCode) {
		this.wageTypeCode = wageTypeCode;
	}
	public String getWageTypeDescription() {
		return wageTypeDescription;
	}
	public void setWageTypeDescription(String wageTypeDescription) {
		this.wageTypeDescription = wageTypeDescription;
	}
	
}
