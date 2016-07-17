package com.dto;

public class GenderDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5789810365611146977L;
	private String genderId;
    private String description;
	public String getGenderId() {
		return genderId;
	}
	public void setGenderId(String genderId) {
		this.genderId = genderId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
