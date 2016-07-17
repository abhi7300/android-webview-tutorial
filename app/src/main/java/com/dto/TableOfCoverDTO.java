package com.dto;

public class TableOfCoverDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9170728902979782099L;
	private String code;
    private String description;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
