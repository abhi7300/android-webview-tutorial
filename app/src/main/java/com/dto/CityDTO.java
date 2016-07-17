package com.dto;


public class CityDTO  extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8135165838013130277L;
	private String cityId;
	private String cityDescription;
	
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCityDescription() {
		return cityDescription;
	}
	public void setCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
	}
	
	
}
