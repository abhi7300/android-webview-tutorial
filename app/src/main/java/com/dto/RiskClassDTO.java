package com.dto;

public class RiskClassDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7369525486489746511L;
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
